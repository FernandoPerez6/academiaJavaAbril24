package com.curso.set;

import java.util.HashSet;
import java.util.Set;

public class PrincipalSet {
    public static void main(String[] args) {
        // Creación del conjunto
        Set<String> conjunto = new HashSet<>();

        // Añadiendo elementos al conjunto
        conjunto.add("manzana");
        conjunto.add("naranja");
        conjunto.add("plátano");

        // Añadir un elemento duplicado
        boolean noAñadido = conjunto.add("manzana"); // Retorna false porque 'manzana' ya está en el conjunto

        // Mostrar resultado del intento de añadir duplicado
        System.out.println("Elemento 'manzana' fue añadido nuevamente: " + noAñadido);

//        // Chequear si un elemento está en el conjunto
        boolean contiene = conjunto.contains("naranja");
        System.out.println("El conjunto contiene 'naranja': " + contiene);
//
//        // Remover un elemento
        boolean removido = conjunto.remove("naranja");
        System.out.println("Elemento 'naranja' fue removido: " + removido);
//
//        // Estado del conjunto después de remover un elemento
        System.out.println("Contenido del conjunto después de remover: " + conjunto);
//
//        // Iterar sobre el conjunto
        System.out.println("Elementos del conjunto:");
        for (String fruta : conjunto) {
            System.out.println(fruta);
        }
//
//        // Tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + conjunto.size());
    }
}
