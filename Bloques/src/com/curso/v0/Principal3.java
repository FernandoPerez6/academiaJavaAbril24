package com.curso.v0;

public class Principal3 {
	
	{
		System.out.println("Hello1");
	}
	
	static {
		System.out.println("Hello static 1");
	}
	
	Principal3(){
		System.out.println("Constructor Default");
	}

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		Principal3 pri1 = new Principal3();
		
		suma();
		
		Principal3 pri2 = new Principal3();
	}
	
	public static int suma() {
		System.out.println("Paso por suma()");
		return 1+1;
	}
	
	//Hello static 1
	//Hello static 2
	//Hola Mundo
	//Hello1
	//Hello2
	//Constructor Default
	//Hello1
	//Hello2
	//Constructor Default
	
	
	static {
		System.out.println("Hello static 2");
	}

	{
		System.out.println("Hello2");
	}

}
