package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V0 Interface");
		
		Operacion[] arregloOpe = new Operacion[] {
				new Division(8,4),
				new Suma(8,4),
				new Resta(8,4),
				new Multi(8,4),
				new Potencia(8,4)
		};
		
		for(int x=0;x < arregloOpe.length;x++) {
			show(arregloOpe[x]);
		}	
	}
		
	static void show(Operacion ope) {
		//POLIMORFISMO CON INTERFACE
		System.out.println(ope);
		System.out.println(ope.ejecuta());
	}

}
