package com.curso;

public class Principal2 {
	
	public static void main(String[] args) {
		String cadena = "Hello"; //OBJETO INMUTABE 
		cadena = "Hola";
		
		System.out.println(cadena); //Hola
		
		String name = "Patrobas";
		name = name.concat(" Tercio");
		
		System.out.println(name); //PATROBAS TERCIO
		
		StringBuilder sbNombre = new StringBuilder("Epeneto");
		sbNombre.append(" Andronico");
		
		System.out.println(sbNombre); //
		
		sbNombre = null;
		
		System.out.println(sbNombre.length());
		
		
	}

}
