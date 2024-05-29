package com.curso.v13;

public class Noobs {
    public Noobs() {
        try {
            throw new MyException();
        } catch (Exception e) {
        	System.out.println(e.hashCode());
        }
    }

    public static void main(String[] args) {
        Noobs a = new Noobs();
        Noobs b = new Noobs();
        Noobs c = a;
        
        System.out.println(a);
        System.out.println(b);

        
        System.out.println("Fin de Programa");
    }
}

class MyException extends Exception {
}

