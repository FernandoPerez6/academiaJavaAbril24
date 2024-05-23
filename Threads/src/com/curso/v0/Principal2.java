package com.curso.v0;

//Clase principal
public class Principal2 {
	public static void main(String[] args) {
		
		// Crear un objeto Thread y pasar el Runnable
		Thread thread1 = new Thread(()->System.out.println("Otro hilo1"));

		// Crear un objeto Thread y pasar el Runnable
		Thread thread2 = new Thread(()->System.out.println("Otro hilo2"));

		// Iniciar el hilo
		thread1.start();
		thread2.start();

		// Mensaje para mostrar que el hilo principal continúa ejecutándose
		System.out.println("El hilo principal está corriendo.");
	}
}
