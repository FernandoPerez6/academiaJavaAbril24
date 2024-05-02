package com.curso.v6;

public class Principal {

	public static void main(String[] args) throws DivisionEntreCero {

		System.out.println("V6");
		int res = 0;
		int x = 8;
		int y = 0;

		res = ejecutaOtro(x, y);
		
		System.out.println("Resultado: " + res);

		System.out.println("Fin de Programa");
	}

	private static int ejecutaOtro(int x, int y) throws DivisionEntreCero {
		int z = 0;
		
		z = ejecutaDiv(x,y);
		
		return z;
	}

	private static int ejecutaDiv(int x, int y) throws DivisionEntreCero  {
		if (y == 0)
			throw new DivisionEntreCero("No se puede dividir entre cero");
		return x / y;
	}

}
