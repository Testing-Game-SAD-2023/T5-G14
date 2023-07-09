package com.testingGameT5.demo.services;

import org.springframework.http.ResponseEntity;

/* Interfaccia concordata con il gruppo G11 responsabile del task T1 per scaricare il codice della classe
 * scelta dall'utente tra quelle mostrate a schermo. Tale interfaccia è implementata, a fini simulativi,
 * dalla classe Mock "DownlFileMock" */
public interface DownlFileInterface {
	
	ResponseEntity<?> downlFile (String name);

}
