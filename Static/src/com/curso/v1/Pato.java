package com.curso.v1;

public class Pato{
	
	//Variables de Instancia de Clase (Objeto)
	String name; //null
	float peso; //0.0
	int contador; //0
	
	public Pato(String name, float peso) {
		this.name = name;
		this.peso = peso;
		++contador;
	}
	
	void incrementaContador() {
		++contador;
	}
	

}
