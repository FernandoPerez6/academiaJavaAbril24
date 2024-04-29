package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
	
		Ave ave = new Aguila();
		
		((Aguila)ave).volarAguila();
		
		System.out.println("********");
		
		Object obj = new Aguila();
		
		//((Aguila)(Ave)obj).volarAguila();
		
		((Aguila)obj).volarAguila();
		
		
	}

}
