package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		
		Operacion ope0 = new Operacion(8,4);
		show(ope0);
		Operacion ope1 = new Suma(8,4);
		show(ope1);
		Operacion ope2 = new Resta(8,4);
		show(ope2);
		Operacion ope3 = new Multi(8,4);
		show(ope3);
		Operacion ope4 = new Potencia(8,4);
		show(ope4);

	}
	
	
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope.toString());
		System.out.println(ope.ejecuta());
	}

}
