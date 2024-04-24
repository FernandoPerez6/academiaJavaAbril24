package com.curso.v6;

public class Potencia extends Operacion {

	public Potencia(int x, int y) {
		super(x, y);
	}
	
	public int ejecuta() {
		return (int)Math.pow(x, y);
	}
	

}
