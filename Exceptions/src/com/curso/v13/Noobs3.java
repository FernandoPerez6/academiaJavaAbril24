package com.curso.v13;

public class Noobs3 {
    public Noobs3() throws MyException {
        try {
            throw new MyException();
		} finally {
        	System.out.println("Paso por Finally");
        }
    }

    public static void main(String[] args)  {
        Noobs3 a = null;
        Noobs3 b = null;
		try {
			a = new Noobs3();
			System.out.println("***PASO1****");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("catch1");
		}
		
		try {
			b = new Noobs3();
			System.out.println("***PASO2****");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("catch2");

		}

        Noobs3 c = a;
        
        System.out.println(a);
        System.out.println(b);

        
        System.out.println("Fin de Programa");
    }
}

