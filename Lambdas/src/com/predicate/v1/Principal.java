package com.predicate.v1;

public class Principal {

	public static void main(String[] args) {

		//DEFINICION CLASE ANONIMA
		Predicado pre1 = new Predicado() {
			@Override
			public boolean probar(String s) {
				return s.endsWith("z");
			}
		};
		
		//EJECUTAR CLASE ANONIMA
		boolean r = pre1.probar("Javax");
		
		System.out.println(r);
		
	}

}
