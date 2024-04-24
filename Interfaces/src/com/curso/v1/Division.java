package com.curso.v1;

public class Division extends OperacionAbstracta {

	public Division(int x, int y) {
		super(x,y);
	}
	
	public int ejecuta() {
		return x / y;
	}

}
