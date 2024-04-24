package com.curso.v1;

public class Potencia extends OperacionAbstracta {

	public Potencia(int x, int y) {
		super(x,y);
	}
	
	public int ejecuta() {
		return (int)Math.pow(x, y);
	}

}
