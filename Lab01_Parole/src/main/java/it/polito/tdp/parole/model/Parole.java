package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	ArrayList<String> elencoParole= new ArrayList<String>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		elencoParole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(elencoParole, new ComparatoreParole());
//		
//		for(String s:elencoParole) {
//			System.out.println(s);
//		}
		return elencoParole;
	}
	
	public void reset() {
		for(String s:elencoParole) {
			elencoParole.remove(s);
		}
	}

}
