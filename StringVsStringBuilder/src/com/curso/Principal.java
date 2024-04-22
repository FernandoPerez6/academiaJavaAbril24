package com.curso;

public class Principal {

	public static void main(String[] args) {

		String cadena1 = "Hello";
		String cadena2 = "Hello";
		String cadena3 = "Hello";
		String cadena4 = new String("Hello");
		
		//String cadena5 = new String("Hello");
		//cadena2 = cadena4;

		System.out.println(cadena1==cadena4); //false
		System.out.println(cadena1.equals(cadena4)); //true
		
		// 2 Objetos
		// 4 Variables Referencia
		
		System.out.println("**********");
		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false


	}

}
