package com.predicate.v4;

public class Principal {

	public static void main(String[] args) {

		// DEFINICION LAMBDA
		Predicado<Empleado> pre1 = s -> s.sueldo > 1000;
		// EJECUTAR LAMBDA
		boolean r = pre1.probar(new Empleado("Tercio", 40, 100));
		System.out.println(r);

		// DEFINICION LAMBDA
		Predicado<StringBuilder> pre2 = x -> x.length() > 5;
		// EJECUTAR LAMBDA
		r = pre2.probar(new StringBuilder("Tercio"));
		System.out.println(r);

		// DEFINICION LAMBDA
		Predicado<String> pre3 = x -> x.endsWith("z");
		// EJECUTAR LAMBDA
		r = pre3.probar("Tercioz");
		System.out.println(r);

	}

}
