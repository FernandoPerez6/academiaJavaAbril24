package com.predicate.v2;

public class Principal {

	public static void main(String[] args) {

		System.out.println("StringBuilder");
		
		//DEFINICION LAMBDA
		Predicado pre1 =  s -> s.length()>5;
		
		//EJECUTAR LAMBDA
		boolean r = pre1.probar(new StringBuilder("Java"));
		
		System.out.println(r);
		
	}

}
