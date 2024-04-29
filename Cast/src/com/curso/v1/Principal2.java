package com.curso.v1;

public class Principal2 {

	public static void main(String[] args) {
	
		Object obj = new Aguila();
		
		Ave ave = (Ave)obj;
		
		Aguila aguila = (Aguila)ave;
		
		aguila.volarAguila();
		
	}

}
