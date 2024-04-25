package com.curso.v2;

public class Pato extends Ave {

	Pato(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	
}
