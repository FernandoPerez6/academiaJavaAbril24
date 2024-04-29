package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
	
		//Ave aguila1 = new Aguila();
		//aguila1.volar();
		
		Ave aguila2 = new Aguila(); //<==
		
		Aguila aguila3 = (Aguila)aguila2;
		
		aguila3.volarAguila();
		
	}

}
