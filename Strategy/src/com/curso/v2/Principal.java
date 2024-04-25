package com.curso.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Ave ave1 = new Pato("Lucas");
		ave1.cv = new SiVolar();
		show(ave1);
		
		ave1.cv = new NoVolar();
		show(ave1);
		
		ave1.cv = new AleatorioVolar();
		show(ave1);


	}

	private static void show(Ave ave) {
		System.out.println("***********");
		System.out.println(ave);
		ave.volar();
	}

}
