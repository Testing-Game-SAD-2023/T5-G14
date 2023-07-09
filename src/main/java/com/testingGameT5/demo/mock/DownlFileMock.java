package com.testingGameT5.demo.mock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockMultipartFile;
import com.testingGameT5.demo.services.DownlFileInterface;

/* Implementazione fittizia dell'interfaccia concordata con il gruppo G11. Questa funzione richiede un 
 * ingresso una stringa corrispondente al nome della classe, che viene utilizzato per la ricerca di questa
 * nel database (dal gruppo G11). Siccome questa è un'implementazione fittizia, la ricerca viene solo
 * simulata e per tale il parametro di ingresso non é utilizzato. */
public class DownlFileMock implements DownlFileInterface {
	
	@Override
	public ResponseEntity<?> downlFile (String name) {
		String content = "This is the content of the file.";
		String filename = "example.java";
		byte[] bytes = content.getBytes();
		MockMultipartFile multipartFile = new MockMultipartFile(filename, bytes);
		return new ResponseEntity<>(multipartFile, HttpStatus.OK);
	}

}
