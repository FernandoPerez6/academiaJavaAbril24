package com.curso.v13;

public class Noobs1 {
    public Noobs1() throws MyException {
        try {
            throw new MyException();
		} finally {
        	System.out.println("Paso por Finally");
        }
    }

    public static void main(String[] args) throws MyException {
        Noobs1 a = new Noobs1();
        Noobs1 b = new Noobs1();
        Noobs1 c = a;
        
        System.out.println(a);
        System.out.println(b);

        
        System.out.println("Fin de Programa");
    }
}

