package com.curso.v0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> stream = numbers.stream(); //CREA STREAM
		
		List<String> resList = stream.map(x -> x+"$") //INTERMEDIO STREAM
		.collect(Collectors.toList()); //TERMINA STREAM
		
		System.out.println(resList);
		
		
		
	}

}
