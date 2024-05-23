package com.curso.v0;

public class PrincipalThread1 extends Thread {
	
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hilo Principal: Inicio de Programa");

        Thread t1 = new PrincipalThread1();

        t1.start(); //EJECUTAR SEGUNDO HILO
        
        //SLEEP 2 SEGUNDOS
        
        Thread.sleep(2000);
        
        System.out.println("Hilo Principal: Fin de Programa");
    }
    
    @Override
    public void run() {
    	System.out.println("NombreHilo: "+Thread.currentThread().getName());
    }

}
