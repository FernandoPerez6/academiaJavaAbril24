package com.curso.v0;

public class PrincipalThread extends Thread {
	
    public static void main(String[] args) {
        Thread t1 = new PrincipalThread();
        Thread t2 = new PrincipalThread();

        t1.start();
        t2.start();
        
        System.out.println("Fin de Programa");
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++)
            System.out.println(Thread.currentThread().getName() + ": "+i);
    }
}
