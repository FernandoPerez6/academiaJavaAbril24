package com.curso.v0;

public class Resta extends Object {
	
	private int x;
	private int y;
	
	public Resta(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int ejecuta() {
		return x - y;
	}

	@Override
	public String toString() {
		return "Resta [x=" + x + ", y=" + y + "]";
	}

}
