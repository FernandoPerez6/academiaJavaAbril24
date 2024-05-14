package com.curso.v0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> stream = numbers.stream(); //CREA STREAM
		
		List<Integer> resList = stream.map(x -> x*10) //INTERMEDIO STREAM
		.collect(Collectors.toList()); //TERMINA TERMINA
		
		System.out.println(resList);
		
		
		
	}

}
