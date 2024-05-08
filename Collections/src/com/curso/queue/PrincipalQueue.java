package com.curso.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrincipalQueue {
    public static void main(String[] args) {
        // Creación de la cola
        Queue<String> cola = new LinkedList<>();

        // Añadiendo elementos a la cola
        cola.offer("Juan");  // offer() añade un elemento al final de la cola
        cola.offer("María");
        cola.offer("Carlos");
        cola.offer("Carlos");


        // Mostrar el elemento en la cabeza de la cola sin removerlo
        System.out.println("Cabeza de la cola (peek): " + cola.peek()); // Devuelve "Juan"

//        // Remover y retornar el elemento en la cabeza de la cola
        String name = cola.poll();
        System.out.println("Elemento removido (poll): " + name); // Remueve y devuelve "Juan"
//
//        // Estado de la cola después de remover un elemento
        System.out.println("Contenido de la cola después de poll: " + cola);
//
//        // Añadir más elementos
        cola.offer("Ana");
        cola.offer("Luis");
        
        System.out.println("Queue actual: "+cola);
//
//        // Mostrar el elemento en la cabeza de la cola, removiéndolo
        name = cola.remove();
        System.out.println("Elemento removido (remove): " + name); // Remueve y devuelve "María"
//
//        // Estado final de la cola
        System.out.println("Contenido final de la cola: " + cola);
    }
}
