package com.curso.v1;

public class Multi extends OperacionAbstracta {

	public Multi(int x, int y) {
		super(x,y);
	}
	
	public int ejecuta() {
		return x * y;
	}

}
