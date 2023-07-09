# T5-G14
Requisiti sull’avvio del Primo Scenario di Gioco

DESCRIZIONE DEL TASK

L'applicativo sviluppato si concentra sull'interfacciamento con l'utente consentendogli di avviare una partita e di configurarla
scegliendo contro quale robot giocare e quale classe testare. La configrazione della partita è consentita solo ad un giocatore
che ha superato la fase di login. Il task termina redirezionando l'utente ad una pagina in cui può essere avviato l'editor.


PROCEDURA DI INSTALLAZIONE SU DOCKER

Di seguito vengono riportati i comandi necessari per costruire un'Immagine Docker ed il corrispondente Container per l'esecuzione del task:
1) all'interno della cartella "demo", aprire il terminale ed inserire il comando << docker build -t nome_immagine . >> per creare l'immagine;
2) attraverso il comando << docker images >> è possibile visualizzare l'elenco delle Immagini create con i rispettivi identificativi;
3) inserire il comando << docker run -pPorto_Scelto:8080 prime_tre_lettere_id_immagine >> per creare il Container a partire dall'Immagine selezionata
   (viene effettuato un mapping tra il porto 8080 usato dall'applicazione e il porto effettivo);
4) il Container si avvierà automaticamente e non sarà possibile usare la Shell, pertanto, premere ctrl+C per arrestarlo;
5) attraverso il comando << docker ps -a >> è possibile visualizzare l'elenco dei Container creati con i rispettivi identificativi e lo stato del
   Container (attivo o non attivo);
6) utilizzare il comando << docker start id_container >> per avviare il Container (e quindi il Server) in background, se l'operazione va a
   buon fine, l'id del Container avviato verrà mostrato nella Shell;
7) è possibile utilizzare l'applicativo sviluppato all'indirizzo http://localhost:Porto_Scelto;
8) per arrestare il Container (e quindi il Server) utilizzare il comando << docker stop id_container >> , se l'operazione va a buon fine,
   l'id del Container arrestato verrà mostrato nella Shell.
