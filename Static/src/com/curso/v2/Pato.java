package com.curso.v2;

public class Pato{
	
	//Variables de Instancia de Clase (Objeto)
	String name; //null
	float peso; //0.0
	
	//Variable de Clase
	static int contador; //0
	
	public Pato(String name, float peso) {
		this.name = name;
		this.peso = peso;
		++contador;
	}

	

}
