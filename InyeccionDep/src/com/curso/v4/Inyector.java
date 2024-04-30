package com.curso.v4;

public class Inyector {
	
	//Inyección por la variable (Interface)
	static Becario inyectarComputadora(String nombre,String tipo){
		if (tipo=="W")
			return new Becario(nombre,new ComputadoraWindows("XP"));
		else if (tipo=="L")
			return new Becario(nombre,new ComputadoraLinux("Ubuntu 20.0"));
		else if (tipo=="M")
			return new Becario(nombre,new ComputadoraMac("Sierra"));
		else
			return new Becario(nombre,new ComputadoraMock("Duck"));
	}


}
