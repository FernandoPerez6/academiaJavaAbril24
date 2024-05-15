package com.curso.v0;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Patrobas",100.0);
		
		//DEFINICION LAMBDA
		Predicate<Empleado>  pre; // = x -> Empleado.isRich(x);
		pre = Empleado::isRich;
		
		boolean res = pre.test(e1);
		
		System.out.println(res);
		
		System.out.println("*************");
		
		BiPredicate<Empleado,Double> bipre; 
				 //= (e,d) -> Empleado.isRichWithIncrement(e,d);
		bipre = Empleado::isRichWithIncrement;
		
		res = bipre.test(e1, 901.00);
		
		System.out.println(res);
		
		
	}

}
