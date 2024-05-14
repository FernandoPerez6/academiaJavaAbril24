package com.curso.v0;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Principal4 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
				
		IntStream streamInt = numbers.stream()
						.mapToInt(n -> n);
		
		OptionalDouble od = streamInt.average();
		
		double res = od.orElse(0.0);
		
		System.out.println(res);
		
		
	}

}
