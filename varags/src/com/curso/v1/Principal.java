package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1");
		Cliente c1 = new Cliente("Andronico");
		c1.asignarCuenta(new String[]{});
		System.out.println("***********");
		c1.asignarCuenta(new String[]{"zx01"});
		System.out.println("***********");
		c1.asignarCuenta(new String[]{"zx01","xy03"});
		System.out.println("***********");
		c1.asignarCuenta(new String[]{"zx01","xy03","zu09","zx01","xy03","zu09"});

	}

}
