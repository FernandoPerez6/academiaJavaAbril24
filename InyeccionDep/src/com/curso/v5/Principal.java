package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V5");
		Becario becario0 = Inyector
				.inyectarComputadora("Tercio", TipoComputadora.WINDOWS);
		becario0.trabajar();
		
		Becario becario1 = Inyector
				.inyectarComputadora("Patrobas",TipoComputadora.LINUX);
		becario1.trabajar();

		
	}

}
