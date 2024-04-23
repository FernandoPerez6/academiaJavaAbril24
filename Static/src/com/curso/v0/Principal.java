package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Pato pato1 = new Pato("Donald",4.5F);
		Pato pato2 = new Pato("Lucas",6.5F);
		Pato pato3 = new Pato("Patito Feo",3.5F);
				
		System.out.println(pato1.contador); //1 
		System.out.println(pato2.contador); //2 
		System.out.println(pato3.contador); //1 


	}

}
