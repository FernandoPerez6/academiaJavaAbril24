package com.curso.v8;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Object obj1 = getAguila();
		
		if (obj1 instanceof AguilaCalva) {		
			AguilaCalva ac = (AguilaCalva) obj1; 	
			System.out.println(ac.tipo);  
			ac.volar(); 
			ac.volarAguilaCalva(); 
			ac.volarAguila(); 
			ac.volarAve();
			System.out.println(ac.toString());
		}else {
			System.out.println("No soy Aguila Calva");
		}
		
	}

	private static Aguila getAguila() {
		
		Aguila[] arregloAguila = {
			new AguilaCalva(),
			new AguilaReal()
		};
		
		int aleatorio = new Random().nextInt(2);
		
		Aguila a = arregloAguila[aleatorio];
		
		System.out.println(a);
		
		return a;
	}

}
