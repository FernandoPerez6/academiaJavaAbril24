package com.curso.v13;

public class Noobs2 {
    public Noobs2() throws MyException {
        try {
            throw new MyException();
		} finally {
        	System.out.println("Paso por Finally");
        }
    }

    public static void main(String[] args)  {
        Noobs2 a = null;
        Noobs2 b = null;
		try {
			a = new Noobs2();
			System.out.println("***PASO****");
			b = new Noobs2();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
        Noobs2 c = a;
        
        System.out.println(a);
        System.out.println(b);

        
        System.out.println("Fin de Programa");
    }
}

