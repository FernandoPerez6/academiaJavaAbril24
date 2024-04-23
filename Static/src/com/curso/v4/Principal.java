package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Pato.contador); //0
				
		Pato pato1 = new Pato("Donald",4.5F);
		
		Pato.getContador();
		
		Pato pato2 = new Pato("Lucas",6.5F);
		Pato pato3 = new Pato("Patito Feo",3.5F);
		
		Pato.getContador();
	
//		System.out.println(pato1.contador); //3 
//		System.out.println(pato2.contador); //3 
//		System.out.println(pato3.contador); //3 

		System.out.println(Pato.contador); //3
		
		System.out.println(
				Pato.getContador()); //3


	}

}
