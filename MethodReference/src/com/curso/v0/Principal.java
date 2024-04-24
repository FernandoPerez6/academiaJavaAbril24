package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Patrobas",100.0);
		
		Empleado.addSueldo(e1);
		
		System.out.println(e1.sueldo);
	}

}
