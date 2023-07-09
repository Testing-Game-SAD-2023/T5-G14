package com.testingGameT5.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.testingGameT5.demo.mock.*;
import com.testingGameT5.demo.services.*;

@Controller
public class GameController {
		
	/* Funzione che restituisce la pagina iniziale dell'applicazione */
	@RequestMapping("/")
	public String start() {
		
		return "start";
	}
	
	/* Funzione che restituisce la pagina di login dell'applicazione */
	@RequestMapping("/login")
	public String loginpage() {
		
		return "loginpage";
	}
	
	/* Funzione richiamata a seguita dell'inserimento delle credenziali nella pagina di login per la 
	 * verifica di queste ultime, in caso di credenziali valide viene restituita la pagina successiva
	 * (matchsettings) con l'ID del giocatore attraverso la struttura dati ModelAndView; altrimenti 
	 * viene restituita nuovamente la pagina di login (diversa dalla precedente poiché riporta un 
	 * messaggio che comunica che le credenziali non sono valide). Tale funzione, per l'ottenimento 
	 * dell'ID e la verifica delle credenziali, richiama la funzionalità sviluppata dal gruppo G01. */
	@PostMapping("/checklogin")
	public ModelAndView Login(@RequestParam("email") String email, @RequestParam("password") String password) {
		
		GetIDInterface mockGetID = new GetIDMock();
		
		Integer value = mockGetID.getID(email,password);
		
		if(value == -1) {
			ModelAndView modelAndView = new ModelAndView("loginpageerror");
			return modelAndView;
		}
		
		ModelAndView modelAndView = new ModelAndView("matchsettings","model",value);	
		return modelAndView;
	}
	
	/* Funzione che restituisce la pagina di avvio dell'editor dell'applicazione */
	@RequestMapping("/starteditor")
	public String starteditor() {
		
		return "T6start"; 
	}			
	
}