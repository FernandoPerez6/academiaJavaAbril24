package com.predicate.v0;

public class Principal {

	public static void main(String[] args) {

		//DEFINICION LAMBDA
		Predicado pre1 = x -> x.endsWith("z");
		
		//EJECUTAR LAMBDA
		boolean r = pre1.probar("Javax");
		
		System.out.println(r);
		
	}

}
