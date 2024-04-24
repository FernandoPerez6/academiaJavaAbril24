package com.curso.v1;

public class Resta extends OperacionAbstracta {

	public Resta(int x, int y) {
		super(x, y);
	}

	public int ejecuta() {
		return x - y;
	}


}
