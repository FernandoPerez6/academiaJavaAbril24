package com.curso.v0;

public class Principal2 {
	
	{
		System.out.println("Hello1");
	}
	
	Principal2(){
		System.out.println("Constructor Default");
	}

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		Principal2 pri1 = new Principal2();
		
		Principal2 pri2 = new Principal2();

	}
	
	//Hola Mundo
	//Hello1
	//Hello2
	//Constructor Default
	//Hello1
	//Hello2
	//Constructor Default
	
	{
		System.out.println("Hello2");
	}

}
