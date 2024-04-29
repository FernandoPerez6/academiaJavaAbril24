package com.curso.v2;

public class Becario {
	
	//HAS-A
	String nombre;
	//BAJO ACOPLAMIENTO
	Computadora compu;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void trabajar() {
		compu.encender();
		System.out.println("Comienza trabajar: "+nombre);
	}
	


}
