package com.curso;

public class Principal {

	public static void main(String[] args) {
		int x = 5; //PRIMITIVO (Estructurada)
		String cadena = "Hello"; //OBJETO INMUTABE 
		StringBuilder sb = new StringBuilder("Hola"); //OBJETO MUTABLE
		
		modifica(x,cadena,sb);
		
		System.out.println("****main()******");
		System.out.println(x); //5
		System.out.println(cadena); // Hello
		System.out.println(sb); // Hola Mundo

	}

	static void modifica(int x, String cadena, StringBuilder sb) {
		x = x + 5;
		cadena = cadena.concat(" World");
		sb.append(" Mundo");
		
		System.out.println("****modifica()******");
		System.out.println(x); //10
		System.out.println(cadena); //Hello World
		System.out.println(sb); //Hola Mundo
		
	}

}
