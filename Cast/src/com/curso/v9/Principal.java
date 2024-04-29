package com.curso.v9;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Object obj1 = getAguila();
		
		if (obj1 instanceof AguilaCalva) {	
			System.out.println(((AguilaCalva)obj1).tipo);
			((AguilaCalva)obj1).volarAguilaCalva();
		}else {
			System.out.println(((AguilaReal)obj1).tipo);
			((AguilaReal)obj1).volarAguilaReal();
		}
		
		((Ave)obj1).volar();
		
		
		
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
