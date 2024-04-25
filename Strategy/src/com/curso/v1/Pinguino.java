package com.curso.v1;

public class Pinguino extends Ave {

	Pinguino(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	
}
