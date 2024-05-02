package com.curso.v9;

public class Principal2 {
	
	public static void main(String[] args) {
		try{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Fin de Programa");
	}

}
