package com.testingGameT5.demo.services;

import org.springframework.web.bind.annotation.RequestParam;

/* Interfaccia concordata con il gruppo G01, responsabile del task T2-T3, per recuperare l'ID del giocatore
 * a seguito del login. Tale interfaccia è implementata, a fini simulativi, dalla classe Mock 
 * "GetIDMock" */
public interface GetIDInterface {
	
	Integer getID(@RequestParam("email") String email, @RequestParam("password") String password);

}
