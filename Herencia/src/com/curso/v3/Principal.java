package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		Operacion ope0 = new Operacion(8,4);
		show(ope0);
		Suma ope1 = new Suma(8,4);
		show(ope1);
		Resta ope2 = new Resta(8,4);
		show(ope2);
		Multi ope3 = new Multi(8,4);
		show(ope3);
		Potencia ope4 = new Potencia(8,4);
		show(ope4);

	}
	
	
	
	
	
	
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope.toString());
		System.out.println(ope.ejecuta());
	}

}
