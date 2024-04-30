package com.curso.v5;

public class Becario {

	//ENCAPSULACION
	private String nombre;
	private Computadora compu; //INTERFACE 
	
	public Becario(String nombre, Computadora compu) {
		this.nombre = nombre;
		this.compu = compu;
	}
	
	void trabajar() {
		compu.encender();
		System.out.println("Comienza trabajar: "+nombre);
	}
	


}
