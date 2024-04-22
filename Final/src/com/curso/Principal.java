package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		//final Objetos: No puedes cambiar la referencia
		final StringBuilder sb = new StringBuilder("Hello");		
		sb.append(" World");
		
		System.out.println(sb); //Hello World
		
		//final primitivos: Constante
		final int x = 7;
		//x = 8;
		
		//final clase: No puede ser heredada
		
		//final método: No puede ser sobreescrito (Override)
		
		//final método static: No puede ser ocultado
		
		
	}

}
