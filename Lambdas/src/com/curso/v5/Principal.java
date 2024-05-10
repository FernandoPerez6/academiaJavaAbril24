package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V5 Lambda");
		
		Operacion opeSuma = (x,y)->x+y;
		Operacion opeDiv = (a,b)->a/b;
		Operacion opeResta = (int1,int2)->int1-int2;
		Operacion opeMulti = (pato1,pato2)->pato1*pato2;
		Operacion opePotencia = (w,z)->Math.pow(w, z);
			
		Operacion[] arregloOpe = new Operacion[] {
				opePotencia,
				opeDiv,
				opeSuma,
				opeResta,
				opeMulti,
		};
		
		for(int x=0;x < arregloOpe.length;x++) {
			show(arregloOpe[x]);
		}	
	}
		
	static void show(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
