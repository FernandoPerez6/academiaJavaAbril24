package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		int res = 0 ;
		int x = 8;
		int y = 0;
		
		try {
			res = ejecutaDiv(x,y);
		}catch(ArithmeticException e) {
			//System.out.println("***:"+e);
			e.printStackTrace();
		}
		
		System.out.println("Resultado: "+res);
		
		System.out.println("Fin de Programa");
	}

	private static int ejecutaDiv(int x, int y) {
		return x/y;
	}

}
