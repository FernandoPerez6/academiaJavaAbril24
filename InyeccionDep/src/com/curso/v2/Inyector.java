package com.curso.v2;

public class Inyector {
	
	static Computadora cl = new ComputadoraLinux("Ubuntu 20.0");
	static Computadora cw = new ComputadoraWindows("XP");
	static Computadora cm = new ComputadoraMac("Sierra");
	static Computadora cx = new ComputadoraMock("Duck");

	
	static void inyectarComputadora(Becario bec,String tipo){
		if (tipo=="W")
			bec.compu = cw;
		else if (tipo=="L")
			bec.compu = cl;
		else if (tipo=="M")
			bec.compu = cm;
		else
			bec.compu = cx;
	}


}
