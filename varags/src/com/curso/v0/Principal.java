package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Andronico");
		
		c1.asignarCuenta("zx01","xy03");
		System.out.println("***********");
		c1.asignarCuenta("zx01","xy03","zu09");

	}

}
