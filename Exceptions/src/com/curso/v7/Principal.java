package com.curso.v7;

public class Principal {

	public static void main(String[] args)  {

		int res = 0;
		int x = 8;
		int y = -2;

		try {
			res = ejecutaDiv(x, y);
		} catch (DivisionEntreCero e) {
			e.printStackTrace();
		} catch (NoNegativos e) {
			e.printStackTrace();
		}
		
		System.out.println("Resultado: " + res);

		System.out.println("Fin de Programa");
	}

	private static int ejecutaDiv(int x, int y) throws DivisionEntreCero, NoNegativos {
		if (y == 0)
			throw new DivisionEntreCero("No se puede dividir entre cero");
		if (y < 0)
			throw new NoNegativos("No se puede dividir entre un negativo");
		return x / y;
	}

}
