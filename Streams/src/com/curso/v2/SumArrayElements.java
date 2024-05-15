package com.curso.v2;

public class SumArrayElements {

    public static void main(String[] args) {
        int[][][] matrix = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int sum = 0;

        // Iterar a través de cada dimensión del arreglo para calcular la suma
        for (int i = 0; i < matrix.length; i++) {         // Accede a cada array 2D
            for (int j = 0; j < matrix[i].length; j++) {  // Accede a cada array 1D dentro del array 2D
                for (int k = 0; k < matrix[i][j].length; k++) { // Accede a cada elemento dentro del array 1D
                    sum += matrix[i][j][k];
                }
            }
        }

        // Imprimir el resultado de la suma
        System.out.println("La suma de todos los elementos es: " + sum);
    }
}
