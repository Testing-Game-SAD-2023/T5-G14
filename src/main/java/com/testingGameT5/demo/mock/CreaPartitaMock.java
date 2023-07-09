package com.testingGameT5.demo.mock;

import com.testingGameT5.demo.model.Game;
import com.testingGameT5.demo.services.CreaPartitaInterface;
import org.bson.types.ObjectId;

/* Implementazione fittizia conforme a quella proposta dal gruppo G04, responsabile del task T4, su Github
 * per il salvataggio nel database della partita configurata dall'utente. Oltre al salvataggio nel
 * database, viene restituito anche l'ID creato a seguito dell'inserimento della partita.
 * Tale ID viene inserito nella struttura dati fornita in ingresso, che poi viene restituita al 
 * chiamante come ritorno.  */
public class CreaPartitaMock implements CreaPartitaInterface {
	
	@Override
	public Game CreaPartita(Game game){
		//INSERIMENTO FITTIZIO NEL DATABASE 
		ObjectId id = new ObjectId("0123456789ABCDEF01234567");
		game.setId(id);
		return game;
	}

}
