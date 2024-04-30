package com.curso.v3;

public class Becario {

	//ENCAPSULACION
	private String nombre;
	private Computadora compu; //INTERFACE 
	
	//getter
	public Computadora getCompu() {
		//Solo si tienes el perfil Becario
		return compu;
	}
	
	//setter
	public void setCompu(Computadora compu) {
		//validar si el usuario es un gerente
		this.compu = compu;
	}
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void trabajar() {
		compu.encender();
		System.out.println("Comienza trabajar: "+nombre);
	}
	


}
