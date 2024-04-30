package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Becario becario0 = new Becario("Tercio");
		Inyector.inyectarComputadora(becario0, "X");
		becario0.trabajar();

		Becario becario1 = new Becario("Patrobas");
		Inyector.inyectarComputadora(becario1, "W");
		becario1.trabajar();
		
		Becario becario2 = new Becario("Epeneto");
		Inyector.inyectarComputadora(becario2, "L");
		becario2.trabajar();
		
		Becario becario3 = new Becario("Andronico");
		Inyector.inyectarComputadora(becario3, "W");
		becario3.trabajar();
		
		
	}

}
