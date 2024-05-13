package com.predicate.v3;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Empleado");
		
		//DEFINICION LAMBDA
		Predicado pre =  s -> s.sueldo > 1000;
		
		//EJECUTAR LAMBDA
		boolean r = pre.probar(new Empleado("Tercio",40,1300));
		
		System.out.println(r);
		
	}

}
