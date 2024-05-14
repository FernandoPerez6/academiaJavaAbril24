package com.curso.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal3 {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleado = {
				new Empleado(1,"Tercio",30,1000),
				new Empleado(2,"Patrobas",20,400),
				new Empleado(3,"Epeneto",38,800),
				new Empleado(4,"Andronico",15,1200),
				new Empleado(5,"Rolas",20,1800),
		};
		
		List<Integer> listaInt = Arrays.asList(1,2,3,4,5);
		
		//Empleado emp = arrayEmpleado[5];
		
		List<Empleado> lista = listaInt.stream()
								.map(i -> arrayEmpleado[i-1])
								.collect(Collectors.toList());
		
		lista.forEach(e -> System.out.println(e));
		
		
		
		
	}

}
