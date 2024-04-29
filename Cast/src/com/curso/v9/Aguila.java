package com.curso.v9;

public class Aguila extends Ave {
	
	String tipo = "Tipo Aguila";
	
	@Override
	void volar() {
		System.out.println("Aguila volar");
	}
	
	void volarAguila() {
		System.out.println("Método volarAguila()");
	}

}
