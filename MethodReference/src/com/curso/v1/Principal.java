package com.curso.v1;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Patrobas",200.0);
		
		//Consumer<Empleado> consumer = e -> Empleado.addSueldo(e);
		
		Consumer<Empleado> consumer = new Consumer<>() {
			@Override
			public void accept(Empleado e) {
				Empleado.addSueldo(e);
			}
		};
		
		
		
		consumer.accept(emp1);
		
		System.out.println(emp1.sueldo);
	}

}
