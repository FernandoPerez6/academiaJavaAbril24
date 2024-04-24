package com.curso.v2;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Patrobas",200.0);
		
		Consumer<Empleado> consumer = Empleado::addSueldo;
		
		consumer.accept(emp1);
		
		System.out.println(emp1.sueldo);
	}

}
