package com.curso.v2;

public class Principal {

	final public static void main(String... patitos) {

		System.out.println("V2");
		
		Alumno a1 = new Alumno("Patrobas");
		
		System.out.println(a1.name);
		
		Alumno a2 = new Alumno();
	}

}
