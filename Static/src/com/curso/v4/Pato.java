package com.curso.v4;

public class Pato{
	
	//Variables de Instancia de Clase (Objeto)
	String name; //null
	float peso; //0.0
	
	//Variable de Clase
	static int contador; //0
	
	public Pato(String name, float peso) {
		super();
		this.name = name;
		this.peso = peso;
		++contador;
	}
	
	//Método Clase
	static int getContador() {
		return contador;
	}

	//Método Clase
//	static String getNombre() {
//		return name;
//	}
	
	//Los métodos static no pueden trabajar
	//con elementos no static (Instancia de Clase)
	
	//Los métodos de instancia de clase si pueden
	//trabajar con los elementos static.

}
