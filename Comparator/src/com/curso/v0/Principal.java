package com.curso.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Empleado[] arrayEmpleado = {
				new Empleado("Tercio",30,1000),
				new Empleado("Patrobas",20,400),
				new Empleado("Epeneto",38,800),
				new Empleado("Andronico",15,1200),
				new Empleado("Rolas",20,1800),
		};
		
		List<Empleado> lista = Arrays.asList(arrayEmpleado);
		
		Collections.sort(lista);
		
		lista.forEach(x -> System.out.println(x));
	}

}
