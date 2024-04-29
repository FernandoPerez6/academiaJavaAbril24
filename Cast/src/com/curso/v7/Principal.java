package com.curso.v7;

public class Principal {

	public static void main(String[] args) {
		
		Object obj1 = new AguilaReal();
		
		Ave ave = (Ave)obj1;
		
		Aguila aguila = (Aguila)ave;
		
		AguilaCalva ac = (AguilaCalva) aguila; //CLASS CAST EXCEPTION
		
//		System.out.println(ac.tipo);  
//		ac.volar(); 
//		ac.volarAguilaCalva(); 
//		ac.volarAguila(); 
//		ac.volarAve();
//		System.out.println(ac.toString());

		
	}

}
