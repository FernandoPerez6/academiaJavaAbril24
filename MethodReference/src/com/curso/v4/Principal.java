package com.curso.v4;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Patrobas",100.0);
		
		Consumer<Double> consumer = porc -> emp1.addSueldo(porc);
		
		consumer.accept(1.50);
		
		System.out.println(emp1.sueldo);
	}

}
