package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Component c1 = new LeafConstante(3.0);
		Component c2 = new LeafConstante(9.0);
		Component c3 = new LeafConstante(4.0);
		
		System.out.println(c1.getValor());
		System.out.println(c2.getValor());
		System.out.println(c3.getValor());



		
		
	}

}
