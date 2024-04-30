package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		Becario becario0 = Inyector.inyectarComputadora("Tercio", "W");
		becario0.trabajar();
		
		Becario becario1 = Inyector.inyectarComputadora("Patrobas", "L");
		becario1.trabajar();

		
	}

}
