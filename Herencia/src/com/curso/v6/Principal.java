package com.curso.v6;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V6");
		
		Operacion[] arregloOpe = new Operacion[] {
				new Operacion(8,4),
				new Suma(8,4),
				new Resta(8,4),
				new Multi(8,4),
				new Potencia(8,4)
		};
		
//		for(int x=0;x < arregloOpe.length;x++) {
//			show(arregloOpe[x]);
//		}
		
		//forEach
		for (Operacion o:arregloOpe) {
			show(o);
		}

	}
		
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope.toString());
		System.out.println(ope.ejecuta());
	}

}
