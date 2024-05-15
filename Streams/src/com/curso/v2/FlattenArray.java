package com.curso.v2;

import java.util.Arrays;

public class FlattenArray {
    public static void main(String[] args) {
        int[][][] matrix = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        // Usando Streams para aplanar el arreglo tridimensional a bidimensional
        int[][] flattened = Arrays.stream(matrix)
        		.flatMap(Arrays::stream) //INTERMEDIA int[][]
        		.toArray(int[][]::new);

        System.out.println(Arrays.toString(flattened));
        
        for (int[] arrayUni :flattened) {
        	System.out.println(Arrays.toString(arrayUni));
        }
        
        
        
    }
}
