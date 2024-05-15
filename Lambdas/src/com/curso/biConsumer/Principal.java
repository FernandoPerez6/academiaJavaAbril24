package com.curso.biConsumer;

import java.util.function.BiConsumer;

public class Principal {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> bc = (x,y) -> {
			System.out.println(x+y);
			return;
		};
		
		bc.accept(4, 5);
		Principal.show();
		
	}
	
	static void show() {
		System.out.println("Hello world");
		return;
	}

}
