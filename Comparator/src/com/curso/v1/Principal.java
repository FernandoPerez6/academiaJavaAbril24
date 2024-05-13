package com.curso.v1;

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
		
		System.out.println("Comparando por Edad");
		Collections.sort(lista, new ComparatorEdad());
		lista.forEach(x -> System.out.println(x));
		
		System.out.println("Comparando por Sueldo");
		Collections.sort(lista, new ComparatorSueldo());
		lista.forEach(x -> System.out.println(x));
		
		System.out.println("Comparando por Nombre");
		Collections.sort(lista, new ComparatorNombre());
		lista.forEach(x -> System.out.println(x));
	}

}
