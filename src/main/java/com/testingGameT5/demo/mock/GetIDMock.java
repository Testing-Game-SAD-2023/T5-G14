package com.testingGameT5.demo.mock;

import org.springframework.web.bind.annotation.RequestParam;
import com.testingGameT5.demo.services.GetIDInterface;

/* Implementazione fittizia dell'interfaccia concordata con il gruppo G01. La funzione riceve in ingresso
 * una stringa, corrispondente all'email, e un'altra stringa, corrispondente alla password; essa 
 * restituisce un'istanza della classe Integer che rappresenta l'ID del giocatore. Come concordato con
 * il gruppo, è restituito -1 nel momento in cui si verifica un errore nell'accesso. Ai fini simulativi, è
 * stato effettuato un semplice controllo sulla stringa che rappresenta l'email; l'implementazione
 * effettiva del controllo dei dati dei giocatori all'atto del login sarà compito del gruppo G01.
 */
public class GetIDMock implements GetIDInterface {
	
	@Override
	public Integer getID(@RequestParam("email") String email, @RequestParam("password") String password) {
		
		if(email.equals("ciao")) return -1;
		else return 123;

	}

}
