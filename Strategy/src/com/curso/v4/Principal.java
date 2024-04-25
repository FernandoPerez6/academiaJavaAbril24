package com.curso.v4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");

		Ave ave1 = new Pato("Lucas");
		show(ave1);
		
		Ave ave2 = new Aguila("America");
		show(ave2);
	
		Ave ave3 = new Pinguino("Chilly");
		show(ave3);
		
		ave3.cv = new SiVolar();
		show(ave3);

	}

	private static void show(Ave ave) {
		System.out.println("***********");
		System.out.println(ave);
		ave.volar();
	}

}
