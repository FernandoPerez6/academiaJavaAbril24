package com.curso.v0;

public class Empleado {
	
	int id;
	String nombre;
	int edad;
	double sueldo;
	
	public Empleado(int id, String nombre, int edad, double sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
}
