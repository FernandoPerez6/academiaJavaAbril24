package com.curso.v1;

public class Aguila extends Ave {

	Aguila(String nombre){
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	
}
