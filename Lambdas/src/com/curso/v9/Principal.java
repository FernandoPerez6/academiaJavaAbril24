package com.curso.v9;

import java.util.*;
import java.util.function.BinaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V8 Lambda");
		
		//DEFINICIONES DE LAMBDA

		BinaryOperator<Integer> opeMulti = (Integer pato1, Integer pato2) -> {
			System.out.println("Multiplicación");
			int res = pato1*pato2;
			return res;
		};
		
		BinaryOperator<Integer> opePotencia = (w,z)-> {
			System.out.println("Potencia");
			return (int)Math.pow(w, z);
		};
			
		List<BinaryOperator<Integer>> arregloOpe = new ArrayList<>();
		arregloOpe.add((x,y)-> {
			System.out.println("Suma");
			return x+y;
		});
		arregloOpe.add((a,b)->a/b);
		arregloOpe.add((int1,int2)->int1-int2);
		arregloOpe.add(opeMulti);
		arregloOpe.add(opePotencia);
		
		for(BinaryOperator<Integer> bo:arregloOpe) {
			show(bo);
		}	
	}
		
	static void show(BinaryOperator<Integer> ope) {
		System.out.println(ope.apply(8,4));
	}

}
