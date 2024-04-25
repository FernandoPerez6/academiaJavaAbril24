package com.curso.v2;

public class Aguila extends Ave {

	Aguila(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	
}
