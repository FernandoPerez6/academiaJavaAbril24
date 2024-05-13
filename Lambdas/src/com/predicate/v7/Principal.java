package com.predicate.v7;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V5");

		// DEFINICION LAMBDA
		Predicate<Empleado> pre1 = s -> {
			System.out.println(s);
			System.out.println("Sueldo mayor a 1000");
			return s.sueldo > 1000;
		};
		// EJECUTAR LAMBDA
		boolean r = pre1.test(new Empleado("Tercio", 40, 100));
		System.out.println(r);

		// DEFINICION LAMBDA
		Predicate<StringBuilder> pre2 = x -> x.length() > 5;
		// EJECUTAR LAMBDA
		r = pre2.test(new StringBuilder("Tercio"));
		System.out.println(r);

		// DEFINICION LAMBDA
		Predicate<String> pre3 = (x) -> x.endsWith("z");
		// EJECUTAR LAMBDA
		r = pre3.test("Tercioz");
		System.out.println(r);

	}

}
