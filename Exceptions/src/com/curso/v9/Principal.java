package com.curso.v9;

public class Principal {

	public static void main(String[] args)  {

		int res = 0;
		int x = 800;
		int y = -2;

		try {
			res = ejecutaDiv(x, y);
		} catch (DivisionEntreCero e) {
			e.printStackTrace();
		} catch (NoNegativos e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Paso por Finally");
		}
		
		System.out.println("Resultado: " + res);

		System.out.println("Fin de Programa");
	}

	private static int ejecutaDiv(int x, int y) throws DivisionEntreCero, NoNegativos {
		if (y == 0)
			throw new DivisionEntreCero("No se puede dividir entre cero");
		if (y < 0)
			throw new NoNegativos("No se puede dividir entre un negativo");
		if (x>1000)
			throw new UnsupportedOperationException("X no puede ser mayor a 1000");
		return x / y;
	}

}
