package com.curso.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Ave ave1 = new Pato("Lucas");
		ave1.cv = new SiVolar();
		
		Ave ave2 = new Pato("Donald");
		
		Ave ave3 = new Pato("Patito Feo");
		ave3.cv = new AleatorioVolar();
		
		Ave ave4 = new Aguila("America");
		ave4.cv = new SiVolar();
		
		Ave ave5 = new Pinguino("Chilly Willy");

		List<Ave> listaAves = new ArrayList<>();
		listaAves.add(ave1); 
		listaAves.add(ave2); 
		listaAves.add(ave3); 
		listaAves.add(ave4);
		listaAves.add(ave5);

		show(listaAves);

	}

	private static void show(List<Ave> listaAves) {
		for (Ave a : listaAves) {
			System.out.println(a);
			a.volar();
		}
	}

}
