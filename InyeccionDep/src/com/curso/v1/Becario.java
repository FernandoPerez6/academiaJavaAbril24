package com.curso.v1;

public class Becario {
	
	//HAS-A
	String nombre;
	//ALTO ACOPLAMIENTO
	ComputadoraWindows cw;
	ComputadoraLinux cl;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void trabajar() {
		if (cw == null)
			cl.encender();
		else
			cw.encender();
		
		System.out.println("Comienza trabajar: "+nombre);
	}
	
	void asignarCompu(String tipo) {
		if (tipo=="W")
			cw = new ComputadoraWindows("XP");
		else if (tipo=="L")
			cl = new ComputadoraLinux("Ubuntu 20.0");
		else
			System.out.println("No se asigna nada");
	}
	

}
