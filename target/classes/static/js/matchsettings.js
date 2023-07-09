import {taskT6} from './taskT6.js'; //funzione importata dal file javascript "taskT6.js"

/* Questo file javascript contiene le diverse funzioni richiamate a seguito degli eventi all'interno della
pagina html "matchsettings.html". 
All'avvio della pagina viene popolata la lista dinamica contenente i nomi delle classi disponibili con la
funzione "populateDropdown", che effettua una fetch alla funzione del controller 'sceltaclassi'.
Quando viene selezionata una classe o un robot le scelte effettuate vengono memorizzate in apposite 
variabili. 
Alla pressione del tasto "Conferma", nel caso in cui siano state effettuate entrambe le scelte, viene 
effettuata la fetch alla funzione del controller "creapartita" fornendo come parametro di ingresso la
struttura dati contenente le scelte effettuate e l'ID del giocatore. 
Dopo aver richiamato tale funzione, la stringa Json ricevuta in risposta viene fornita in ingresso alla
funzione javascript "taskT6" importata, richiamata immediatamente dopo la precedente fetch.
*/
document.addEventListener("DOMContentLoaded", function() {
  
  var gamerID = document.getElementById("gamerID").textContent;
  var classesMenu = document.getElementById("classesMenu");
  var robotsMenu = document.getElementById("robotsMenu");
  var selectedClassElement = document.getElementById("selectedClass");
  var selectedRobotElement = document.getElementById("selectedRobot");
  var btnConferma = document.getElementById("btnConferma");

  classesMenu.addEventListener("change", function() {
    var selectedClass = classesMenu.value;
    selectedClassElement.textContent = selectedClass;
  });

  robotsMenu.addEventListener("change", function() {
    var selectedRobot = robotsMenu.value;
    selectedRobotElement.textContent = selectedRobot;
  });

  btnConferma.addEventListener("click", function() {
    var selectedClass = classesMenu.value;
	var selectedRobot = robotsMenu.value;
	
    if ((selectedClass !== "") && (selectedRobot !== "")) {
      var requestData = {
		value1: gamerID,
		value2: selectedClass,
		value3: selectedRobot
	  };
	
	// Effettua una richiesta al controller con il valore selezionato
      fetch('/creapartita', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(requestData) // Invia il valore come JSON
    })
    .then(response => response.json())
    .then(data => {
      // Gestisci la risposta dal controller
      taskT6(data);
      window.location.href = './starteditor' /* Il riferimento alla pagina successiva presente sul tasto
      conferma viene attivato solo a seguito della pressione del pulsante nel caso in cui entrambe le 
      scelte sono state effettuate. */
    })
    .catch(error => {
      console.error('Errore durante la richiesta al controller:', error);
    });

    } else {
      console.log("Seleziona un'opzione prima di confermare.");
    }
  });

function populateDropdown() {
    fetch('/sceltaclassi')
      .then(response => response.json())
      .then(data => {
        data.forEach(option => {
          var optionElement = document.createElement('option');
          optionElement.value = option;
          optionElement.textContent = option;
          classesMenu.appendChild(optionElement);
        });
      })
      .catch(error => {
        console.error('Errore durante la chiamata API:', error);
      });
  }
  populateDropdown();
});