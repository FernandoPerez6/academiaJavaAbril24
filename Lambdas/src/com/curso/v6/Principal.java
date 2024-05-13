package com.curso.v6;

import java.util.function.BinaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V6 Lambda");
		
		//DEFINICIONES DE LAMBDA
		BinaryOperator<Integer> opeSuma = (x,y)->x+y;
		BinaryOperator<Integer> opeDiv = (a,b)->a/b;
		BinaryOperator<Integer> opeResta = (int1,int2)->int1-int2;
		BinaryOperator<Integer> opeMulti = (pato1,pato2)->pato1*pato2;
		BinaryOperator<Integer> opePotencia = (w,z)->(int)Math.pow(w, z);
			
		BinaryOperator<Integer>[] arregloOpe = new BinaryOperator[] {
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
		
	static void show(BinaryOperator<Integer> ope) {
		System.out.println(ope.apply(8,4));
	}

}
