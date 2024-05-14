package com.curso.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal2 {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleado = {
				new Empleado(1,"Tercio",30,1000),
				new Empleado(2,"Patrobas",20,400),
				new Empleado(3,"Epeneto",38,800),
				new Empleado(4,"Andronico",15,1200),
				new Empleado(5,"Rolas",20,1800),
		};
		
		List<Integer> listaInt = Arrays.asList(1,2,3,4,5);
		
		List<String> lista = listaInt.stream()
								.map(i -> arrayEmpleado[i-1])
								.map(z -> z.sueldo)
								.map(w -> "$"+w)
								.collect(Collectors.toList());
		
		lista.forEach(e -> System.out.println(e));
		
		long l = listaInt.stream().count();
		System.out.println(l);
		
		boolean b = listaInt.stream().anyMatch(w -> w==6);
		System.out.println(b);
		
		//Programación Declarativa
		double total = listaInt.stream()
				.map(i -> arrayEmpleado[i-1])
				.mapToDouble(z -> z.sueldo)
				.sum();
		
		System.out.println("Suma sueldos: "+total);
		
		
	}

}
