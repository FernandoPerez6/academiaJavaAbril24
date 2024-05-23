package com.curso.v0;

//Clase que implementa Runnable
class MyRunnable implements Runnable {
 @Override
 public void run() {
     // Código que se ejecutará en el hilo
     System.out.println("El hilo Secundario está corriendo.");
 }
}

//Clase principal
public class Principal {
 public static void main(String[] args) {
     // Crear una instancia de MyRunnable
     Runnable myRunnable = new MyRunnable();
     
     // Crear un objeto Thread y pasar el Runnable
     Thread thread1 = new Thread(myRunnable);
     
     // Crear un objeto Thread y pasar el Runnable
     Thread thread2 = new Thread(myRunnable);
     
     // Iniciar el hilo
     thread1.start();
     thread2.start();

     
     // Mensaje para mostrar que el hilo principal continúa ejecutándose
     System.out.println("El hilo principal está corriendo.");
 }
}
