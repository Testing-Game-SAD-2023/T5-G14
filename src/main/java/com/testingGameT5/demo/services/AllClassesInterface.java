package com.testingGameT5.demo.services;

import java.util.List;
import com.testingGameT5.demo.model.ClassUT;

/* Interfaccia concordata con il gruppo G11 responsabile del task T1 per recuperare le classi disponibili
 * nel sistema e per poterle poi mostrare al giocatore. Tale interfaccia è implementata, a fini simulativi,
 * dalla classe Mock "AllClassesMock". */

public interface AllClassesInterface {
	
	List<ClassUT> AllClasses();
	
}
