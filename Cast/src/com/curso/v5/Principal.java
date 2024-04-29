package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
	
		Aguila aguila = new Aguila();
		
		System.out.println(aguila.tipo);
		
		System.out.println("*********");
		
		Ave ave = new Aguila();
		
		//LOS COMPORTAMIENTOS SE TOMAN DEL OBJETO
		ave.volar();
		
		//LOS ATRIBUTOS SE TOMAN DE LA VARIABLE DE
		//REFERENCIA
		System.out.println(((Aguila)ave).tipo);

	}

}
