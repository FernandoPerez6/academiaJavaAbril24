package com.curso.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrincipalMap {
    public static void main(String[] args) {
        // Creación del mapa
    	//CLAVE(UNICA)  VALOR
        Map<String,     Integer> mapa = new HashMap<>();

        // Añadiendo elementos al mapa
        mapa.put("manzana", 10);
        mapa.put("naranja", 20); //<=REEMPLAZAR
        mapa.put("plátano", 30);
        
        // Añadir un elemento con una clave que ya existe actualiza el valor
        mapa.put("naranja", 25);

        // Obtener el valor asociado con una clave
        Integer valorNaranja = mapa.get("naranja");
        System.out.println("Cantidad de naranjas: " + valorNaranja);
        
//        // Chequear si una clave existe en el mapa
        boolean contieneManzana = mapa.containsKey("manzana");
        System.out.println("El mapa contiene 'manzana': " + contieneManzana);
//
        mapa.put("Manzana", 10);
        System.out.println(mapa);
     
//        // Remover un elemento por su clave
        Integer valorRemovido = mapa.remove("plátano");
        System.out.println("Cantidad removida de 'plátano': " + valorRemovido);
//
//        // Estado del mapa después de remover un elemento
        System.out.println("Contenido del mapa después de remover: " + mapa);
//
//        // Iterar sobre las claves del mapa
        System.out.println("Claves del mapa:");
        Set<String> setString = mapa.keySet();
        System.out.println("Set Claves = "+setString);
        for (String clave : setString) {
            System.out.println(clave);
        }
//
//        // Iterar sobre los valores del mapa
        System.out.println("Valores del mapa:");
        Collection<Integer> collInt = mapa.values();
        for (Integer valor : collInt) {
            System.out.println(valor);
        }
//
//        // Tamaño del mapa
        System.out.println("Tamaño del mapa: " + mapa.size());
        System.out.println("********");
        
        for (String clave : mapa.keySet()) {
            System.out.println("key: "+clave +", value:"+mapa.get(clave));
        }
        
        
    }
}
