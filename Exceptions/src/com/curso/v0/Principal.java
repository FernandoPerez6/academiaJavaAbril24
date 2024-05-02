package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
		
		int res = ejecutaDiv(x,y);
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int ejecutaDiv(int x, int y) {
		return x/y;
	}

}
