package com.curso;

public class Escuela {
	
	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Filologo",5);
		Alumno a2 = new Alumno("Filologo",5);
		Alumno a3 = a1;
		
		System.out.println(a1.equals(a2)); //true

		
		
		
	}

}
