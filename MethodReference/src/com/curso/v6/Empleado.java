package com.curso.v6;

public class Empleado {
	
	String nombre;
	double sueldo;
	
	Empleado(){}
	
	Empleado(String nombre){
		this.nombre = nombre;
	}
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
	

}
