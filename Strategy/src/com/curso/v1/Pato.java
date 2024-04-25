package com.curso.v1;

public class Pato extends Ave {

	Pato(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	
}
