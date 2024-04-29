package com.curso.v0;

public class Becario {
	
	//HAS-A
	String nombre;
	//ALTO ACOPLAMIENTO
	ComputadoraWindows cw = new ComputadoraWindows("XP");
	//Becario y ComputadoraWindows
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void trabajar() {
		//Varios pasos
		cw.encender(); 
		System.out.println("Comienza trabajar: "+nombre);
	}
	

}
