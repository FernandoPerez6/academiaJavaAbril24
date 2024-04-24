package com.curso.v3;
//                IS-A (es una)
public class Suma extends Operacion {

	public Suma(int x, int y) {
		super(x, y);
	}
	
	public int ejecuta() {
		return x + y;
	}


}
