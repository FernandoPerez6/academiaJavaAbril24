package com.curso.v3;

public class Inyector {
	
	//Inyección por la variable (Interface)
	static void inyectarComputadora(Becario bec,String tipo){
		if (tipo=="W")
			bec.setCompu(new ComputadoraWindows("XP"));
		else if (tipo=="L")
			bec.setCompu(new ComputadoraLinux("Ubuntu 20.0"));
		else if (tipo=="M")
			bec.setCompu(new ComputadoraMac("Sierra"));
		else
			bec.setCompu(new ComputadoraMock("Duck"));
	}


}
