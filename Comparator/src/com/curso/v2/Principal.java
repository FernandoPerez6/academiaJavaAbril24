package com.curso.v2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version 2");
		
		Comparator<Empleado> compEdad = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.edad-o2.edad;
			}
		};
		
		Comparator<Empleado> compSueldo = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return (int)(o1.sueldo-o2.sueldo);
			}
		};
		
		Comparator<Empleado> compNombre = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.nombre.compareTo(o2.nombre);
			}
		};
		
		Empleado[] arrayEmpleado = {
				new Empleado("Tercio",30,1000),
				new Empleado("Patrobas",20,400),
				new Empleado("Epeneto",38,800),
				new Empleado("Andronico",15,1200),
				new Empleado("Rolas",20,1800),
		};
		
		List<Empleado> lista = Arrays.asList(arrayEmpleado);
		
		System.out.println("Comparando por Edad");
		Collections.sort(lista, compEdad);
		lista.forEach(x -> System.out.println(x));
		
		System.out.println("Comparando por Sueldo");
		Collections.sort(lista, compSueldo);
		lista.forEach(x -> System.out.println(x));
		
		System.out.println("Comparando por Nombre");
		Collections.sort(lista, compNombre);
		lista.forEach(x -> System.out.println(x));
	}

}
