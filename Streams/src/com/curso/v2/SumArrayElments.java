package com.curso.v2;

import java.util.Arrays;

public class SumArrayElments {

    public static void main(String[] args) {
        int[][][] matrix = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        // Usando Streams para calcular la suma de todos los elementos en el arreglo tridimensional
        int sum = Arrays.stream(matrix)
                        .flatMap(Arrays::stream)    // Aplana de int[][][] a int[][]
                        .flatMapToInt(Arrays::stream) // Aplana de int[][] a IntStream
                        .sum();                     // Suma todos los elementos

        // Imprimir el resultado de la suma
        System.out.println("La suma de todos los elementos es: " + sum);
    }
}
