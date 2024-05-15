package com.curso.v1;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,4,8,10) ;
		
		int result = lista.stream()
						.filter(n -> n%2 == 0) //INTERMEDIO
						.reduce(0, (a,b) -> a+b); //FINAL
		
		System.out.println(result);
	}

}
