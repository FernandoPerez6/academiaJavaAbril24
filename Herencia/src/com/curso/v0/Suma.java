package com.curso.v0;

public class Suma extends Object {
	
	private int x;
	private int y;
	
	public Suma(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int ejecuta() {
		return x + y;
	}

	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}

}
