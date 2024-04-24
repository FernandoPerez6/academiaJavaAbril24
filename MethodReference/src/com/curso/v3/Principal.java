package com.curso.v3;

import java.util.function.BiConsumer;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Patrobas",200.0);
		
		BiConsumer<Empleado,Double> consumer = Empleado::addSueldo;
		
		consumer.accept(emp1,1.15);
		
		System.out.println(emp1.sueldo);
	}

}
