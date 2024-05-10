package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V0 Lambda");
		
		Operacion[] arregloOpe = new Operacion[] {
				new Division(),
				new Suma(),
				new Resta(),
				new Multi(),
				new Potencia()
		};
		
		for(int x=0;x < arregloOpe.length;x++) {
			show(arregloOpe[x]);
		}	
	}
		
	static void show(Operacion ope) {
		System.out.println(ope.getClass().getSimpleName());
		System.out.println(ope.ejecuta(8,4));
	}

}
