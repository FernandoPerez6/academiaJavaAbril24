package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V5");
		
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		Operacion ope4 = new Potencia(8,4);
		
		Operacion[] arregloOpe = new Operacion[] {
			ope0,ope1,ope2,ope3,ope4	
		};
		
		for(int x=0;x < arregloOpe.length;x++) {
			show(arregloOpe[x]);
		}

	}
		
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope.toString());
		System.out.println(ope.ejecuta());
	}

}
