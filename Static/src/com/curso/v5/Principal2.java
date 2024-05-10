package com.curso.v5;

import com.curso.v4.Pato;
import static com.curso.v4.Pato.*;

public class Principal2 {

	public static void main(String[] args) {
		
		System.out.println("V5");
		System.out.println(contador); //0
				
		Pato pato1 = new Pato("Donald",4.5F);
		Pato pato2 = new Pato("Lucas",6.5F);
		Pato pato3 = new Pato("Patito Feo",3.5F);
	
		System.out.println(contador); //3
		
		System.out.println(getContador()); //3


	}

}
