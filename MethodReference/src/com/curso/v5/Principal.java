package com.curso.v5;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Patrobas",500.0);
		
		Consumer<Double> consumer = emp1::addSueldo;
		
		consumer.accept(1.50);
		
		System.out.println(emp1.sueldo);
	}

}
