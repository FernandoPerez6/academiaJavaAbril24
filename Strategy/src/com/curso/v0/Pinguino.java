package com.curso.v0;

public class Pinguino extends Ave {

	Pinguino(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		System.out.println("No puedo volar");
	}
	
	
}
