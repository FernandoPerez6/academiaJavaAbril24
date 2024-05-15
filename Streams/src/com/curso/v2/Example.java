package com.curso.v2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		int[][][] matrix = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		Stream<int[][]> streamArray = Arrays.stream(matrix);

		// int [] [] flattened = null;
//      
//.flatMapToIn(layer)Arrays.string(layer)
//      .flatMapToIn(Arrays::stream))
//.boxed().map(n -> new int[](n)).toArray(int[] []::new);

//System.out.println(Arrays.deepToString(flattened));
	}
}
