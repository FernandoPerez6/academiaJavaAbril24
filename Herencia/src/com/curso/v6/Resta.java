package com.curso.v6;

public class Resta extends Operacion {

	public Resta(int x, int y) {
		super(x, y);
	}
	
	public int ejecuta() {
		return x - y;
	}

}
