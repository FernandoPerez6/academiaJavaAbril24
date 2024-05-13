package com.curso.v7;

import java.util.function.BinaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V7 Lambda");
		
		//DEFINICIONES DE LAMBDA
		BinaryOperator<Integer> opeSuma = (x,y)->x+y;
		BinaryOperator<Integer> opeDiv = (a,b)->a/b;
		BinaryOperator<Integer> opeResta = (int1,int2)->int1-int2;
		BinaryOperator<Integer> opeMulti = (pato1,pato2)->pato1*pato2;
		BinaryOperator<Integer> opePotencia = (w,z)->(int)Math.pow(w, z);
		
		int res;
		//EJECUCION DE LA LAMBDA
		res = opeResta.apply(10, 7);
		System.out.println("Resta: "+res );
		
		res = opePotencia.apply(3, 4);
		System.out.println("Pontencia: "+res );

			
		
	}

}
