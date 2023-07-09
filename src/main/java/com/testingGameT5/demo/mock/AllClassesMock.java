package com.testingGameT5.demo.mock;

import java.util.ArrayList;
import java.util.List;
import com.testingGameT5.demo.model.ClassUT;
import com.testingGameT5.demo.services.AllClassesInterface;

/* Implementazione fittizia dell'interfaccia concordata con il gruppo G11. La funzione deve restituire
 * una lista di classi disponibili nel sistema. Ai fini simulativi, questa funzione restituisce una lista
 * di classi prefissata, in cui è stato impostato solo il nome come "classe i" dove i va da 0 a 30.
 */
public class AllClassesMock implements AllClassesInterface {
	
	@Override
	public List<ClassUT> AllClasses() {
		
		List<ClassUT> ListaClassi = new ArrayList<ClassUT>();
		
		for(int i=0; i<30; i++) {
			String nome1 = String.valueOf(i);
			ClassUT classe1 = new ClassUT("classe " + nome1);
			ListaClassi.add(classe1);
		}
		return ListaClassi;
	}

}
