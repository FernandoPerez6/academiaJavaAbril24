package com.curso.v0;

public class Aguila extends Ave {

	Aguila(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		System.out.println("Si puedo volar");
	}
	
	
}
