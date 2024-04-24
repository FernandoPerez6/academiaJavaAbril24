package com.curso.v1;
//                IS-A (es una)
public class Suma extends OperacionAbstracta {

	public Suma(int x, int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return x + y;
	}

}
