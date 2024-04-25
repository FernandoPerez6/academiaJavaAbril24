package com.curso.v3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");

		Ave ave1 = new Pato("Lucas");
		ave1.cv = new SiVolar();
		show(ave1);
		
		ave1.cv = new NoVolar();
		show(ave1);
		
		ave1.cv = new AleatorioVolar();
		show(ave1);
		
		Ave ave2 = new Aguila("America");
		show(ave2);
	


	}

	private static void show(Ave ave) {
		System.out.println("***********");
		System.out.println(ave);
		ave.volar();
	}

}
