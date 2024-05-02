package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		int res = 0;
		int x = 8;
		int y = 0;

		res = ejecutaDiv(x, y);

		System.out.println("Resultado: " + res);

		System.out.println("Fin de Programa");
	}

	private static int ejecutaDiv(int x, int y) {
		if (y==0)
			throw new DivisionEntreCero("No se puede dividir entre cero");
		return x / y;
	}

}
