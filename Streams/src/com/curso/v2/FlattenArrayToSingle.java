package com.curso.v2;

import java.util.Arrays;

public class FlattenArrayToSingle {
    public static void main(String[] args) {
        int[][][] matrix = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        // Usando Streams para aplanar el arreglo tridimensional a un arreglo unidimensional
        int[] flattened = Arrays.stream(matrix)
                                .flatMap(Arrays::stream) //int[][]
                                .flatMapToInt(Arrays::stream) //int[]
                                .toArray();

        // Imprimir el resultado para verificar
        System.out.println(Arrays.toString(flattened));
    }
}
