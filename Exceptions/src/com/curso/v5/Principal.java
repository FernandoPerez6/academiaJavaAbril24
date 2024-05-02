package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V5");
		int res = 0;
		int x = 8;
		int y = 0;

		res = ejecutaOtro(x, y);
		
		System.out.println("Resultado: " + res);

		System.out.println("Fin de Programa");
	}

	private static int ejecutaOtro(int x, int y) {
		int z = 0;
		try {
			z = ejecutaDiv(x,y);
		} catch (DivisionEntreCero e) {
			e.printStackTrace();
		}
		return z;
	}

	private static int ejecutaDiv(int x, int y) throws DivisionEntreCero  {
		if (y == 0)
			throw new DivisionEntreCero("No se puede dividir entre cero");
		return x / y;
	}

}
