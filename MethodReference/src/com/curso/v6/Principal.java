package com.curso.v6;

import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		//DEFINICION DE LA LAMBDA
		Supplier<Empleado> sup; // = () -> new Empleado();
		sup = Empleado::new;
		
		//EJECUTAR LA LAMBDA
		Empleado e1 = sup.get();
		System.out.println(e1);
		
		System.out.println("*************");
		
		Function<String,Empleado> fun; // = n -> new Empleado(n);
		fun = Empleado::new;
		Empleado e2 = fun.apply("Patrobas");
		System.out.println(e2);
		
		System.out.println("*************");
		
		BiFunction<String,Double,Empleado> bifun; //  = (s,d) -> new Empleado(s,d);
		bifun = Empleado::new;
		Empleado e3 = bifun.apply("Epeneto", 9000.00);
		System.out.println(e3);
		
		
	}

}
