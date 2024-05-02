package com.curso.v3;

public class Principal {

	public static void main(String... args ) {
		System.out.println("V3");
		Cliente c1 = new Cliente("Andronico");
		c1.asignarCuenta();
		System.out.println("***********");
		c1.asignarCuenta("zx01");
		System.out.println("***********");
		c1.asignarCuenta("zx01","xy03");
		System.out.println("***********");
		c1.asignarCuenta("zx01","xy03","zu09","zx01","xy03","zu09");
		System.out.println("***********");
		c1.asignarCuenta(100,"zx01","xy03");
	}

}
