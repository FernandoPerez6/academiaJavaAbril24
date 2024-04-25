package com.curso.v0;

public class Pato extends Ave {

	Pato(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		System.out.println("Si quiero vuelo");
	}
	
	
}
