package com.curso.v3;

public class Alumno extends Object {

	String name;
	int edad;
	StringBuilder matricula;
	float peso;
	float altura;

	public Alumno(String name, int edad, float altura) {
		super();
		this.name = name;
		this.edad = edad;
		this.altura = altura;
	}

	// Sobrecarga (Overloading)
	public Alumno(String name, float peso, int edad) {
		super();
		this.name = name;
		this.edad = edad;
		this.peso = peso;
	}

	// Sobrecarga (Overloading)
	public Alumno(String name, int edad) {
		this.name = name;
		this.edad = edad;
	}

	Alumno() {
		this("Sin nombre", 0);
	}

	public Alumno(String name) {
		super();
		this.name = name;
	}

}
