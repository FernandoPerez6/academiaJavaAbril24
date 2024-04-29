package com.curso.v3;

public class Principal2 {

	public static void main(String[] args) {
	
		//UPCASTING (Cast hacia arriba)
		//CAST IMPLICITO
		Aguila aguila = new Aguila();
		
		Object obj = aguila;
		// ó
		((Object)aguila).toString();

		
	}

}
