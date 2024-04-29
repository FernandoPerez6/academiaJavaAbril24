package com.curso.v6;

public class AguilaCalva extends Aguila {
	
	String tipo = "Tipo Aguila Calva";
	
	@Override
	void volar() {
		System.out.println("Aguila Calva volar");
	}
	
	void volarAguilaReal() {
		System.out.println("Método volarAguilaCalva()");
	}

}
