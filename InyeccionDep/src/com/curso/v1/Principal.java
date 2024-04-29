package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = new Becario("Patrobas");
		becario1.asignarCompu("W");
		becario1.trabajar();
		
		Becario becario2 = new Becario("Epeneto");
		becario2.asignarCompu("L");
		becario2.trabajar();
		
		
	}

}
