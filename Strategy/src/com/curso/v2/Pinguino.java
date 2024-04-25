package com.curso.v2;

public class Pinguino extends Ave {

	Pinguino(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	
}
