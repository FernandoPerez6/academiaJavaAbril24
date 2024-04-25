package com.curso;

public class Principal {

	public static void main(String[] args) {

		String s1 = "Hola";
		String s2 = "Hola";
		String s3 = new String("Hola");
		String s4 = s1;
		String s5 = new String("Hola");
		String s6 = s3;
		
		s2 = null;
		s5 = null;
		s3 = null;
		
	}

}
