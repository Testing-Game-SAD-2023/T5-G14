package com.testingGameT5.demo.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.script.ScriptException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.testingGameT5.demo.model.*;
import com.testingGameT5.demo.services.*;
import com.google.gson.Gson;
import com.testingGameT5.demo.mock.*;

@RestController
public class ControllerRest {
	
	/* Questa funzione é invocata dal file javascript "matchsettings.js" per popolare la lista di classi
	 * disponibili visibile all'utente attraverso la pagina "matchsettings.html". Attraverso la funzione
	 * fornita dal gruppo G11 viene recuperata la lista di classi. Da questa lista ne viene creata
	 * un'altra contenente solo i nomi delle classi che sarà restituita al javascript che invoca tale
	 * funzione. 
	 * */
	@GetMapping("/sceltaclassi")
	public List<String> SceltaClassi() {
		
		AllClassesInterface mockAllClasses = new AllClassesMock();
		
		List<String> ListaNomi = new ArrayList<String>();
		List<ClassUT> ListaClassi = new ArrayList<ClassUT>();
		ListaClassi = mockAllClasses.AllClasses();
		Iterator<ClassUT> it = ListaClassi.iterator();
		
		while(it.hasNext()) {
			ListaNomi.add(it.next().getName());
		}
		
		return ListaNomi;
	}
	
	/* Tale funzione é invocata dal javascript "matchsettings.js" presente nella pagina html 
	 * "matchsettings.html" in corrispondenza della pressione del pulsante di conferma della 
	 * configurazione della partita. In ingresso viene fornita la struttura dati RequestData 
	 * contenente l'ID giocatore, la classe e il robot scelti. In risposta viene fornita una
	 * stringa Json con le informazioni relative alla partita necessarie al gruppo G08 che si
	 * occupa dell'editor. Vengono svolte le seguenti operazioni:
	 * 1. viene effettuato il download del codice della classe;
	 * 2. viene istanziato un oggetto "Game" con tutte le informazioni raccolte;
	 * 3. viene richiamata la funzione "CreaPartita" del gruppo G04 per il salvataggio della 
	 *    partita nel database;
	 * 4. dall'oggetto di tipo"Game" vengono estratte le informazioni necessarie per creare 
	 *    l'oggetto di tipo "MatchAdapter";
	 * 5. l'oggetto di tipo "MatchAdapter" viene convertito in una stringa Json, la quale viene
	 *    fornita come ritorno della funzione. */
	@PostMapping("/creapartita")
	public String createMatch(@RequestBody RequestData selectedValue)  throws IOException, ScriptException, NoSuchMethodException {
		
		DownlFileInterface mockDownlFile = new DownlFileMock();
		CreaPartitaInterface mockCreaPartita = new CreaPartitaMock();
		
		MatchAdapter MatchT6 = new MatchAdapter();
		Game Match = new Game();
		
		String gamerID = selectedValue.getValue1();
		String chosenClass = selectedValue.getValue2();
		String chosenRobot = selectedValue.getValue3();
		
		Match.getHost().setStudentId(gamerID);
		Match.getClassUt().setName(chosenClass);
		Match.getRobot().setRobotId(chosenRobot);
		
		try{
			ResponseEntity<?> classCode = mockDownlFile.downlFile(chosenClass); //chiamata alla funzione del task T1
			MultipartFile file = (MultipartFile) classCode.getBody();
			Match.getClassUt().setClassCode(file);
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		
		Match = mockCreaPartita.CreaPartita(Match); //chiamata alla funzione del task T4
		
		MatchT6.setIdPartita(Match.getId().toString().toUpperCase());
		MatchT6.setIdGiocatore(Match.getHost().getStudentId().toString());
		MatchT6.setIdClasse(Match.getClassUt().getName());
		MatchT6.setCodiceClasse(new String(Match.getClassUt().getClassCode().getBytes(), StandardCharsets.UTF_8));
		MatchT6.setIdRobot(Match.getRobot().getRobotId());
		
		Gson gson = new Gson();
        String strJson = gson.toJson(MatchT6);
                
        return strJson;
		
	}
	
}