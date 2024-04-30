package com.curso.v5;

public class Inyector {
	
	//Inyección por la variable (Interface)
	static Becario inyectarComputadora(String nombre, TipoComputadora tc){
		
		switch(tc) {
		case WINDOWS:
			return new Becario(nombre,new ComputadoraWindows("XP"));
		case LINUX:
			return new Becario(nombre,new ComputadoraLinux("Ubuntu 20.0"));
		case MAC:
			return new Becario(nombre,new ComputadoraMac("Sierra"));
		default: 
			return new Becario(nombre,new ComputadoraMock("Duck"));
		}
			
	}


}
