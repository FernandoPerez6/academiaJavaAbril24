package com.curso.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class PrincipalTreeSet {
    public static void main(String[] args) {
        // Creación del conjunto
        Set<String> conjunto = new TreeSet<>();

        // Añadiendo elementos al conjunto
        conjunto.add("plátano");
        conjunto.add("naranja");
        conjunto.add("manzana");
        conjunto.add("cacahuate");
        conjunto.add("aguacate");

        System.out.println(conjunto);

    }
}
