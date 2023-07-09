package com.testingGameT5.demo.services;

import com.testingGameT5.demo.model.Game;

/* Interfaccia conforme a quella proposta dal gruppo G04, responsabile del task T4, su Github per il
 * salvataggio nel database della partita configurata dall'utente. Tale interfaccia è implementata,
 * a fini simulativi, dalla classe Mock "CreaPartitaMock". */
public interface CreaPartitaInterface {
	
	Game CreaPartita(Game game);

}
