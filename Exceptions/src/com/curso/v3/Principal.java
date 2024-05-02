package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		int res = 0;
		int x = 8;
		int y = 0;

		try {
			res = ejecutaDiv(x, y);
		} catch (DivisionEntreCero e) {
			System.out.println(e.getClass());
		}

		System.out.println("Resultado: " + res);

		System.out.println("Fin de Programa");
	}

	private static int ejecutaDiv(int x, int y) throws DivisionEntreCero {
		if (y == 0)
			throw new DivisionEntreCero("No se puede dividir entre cero");
		return x / y;
	}

}
