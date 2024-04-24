package com.curso.v4;

public class Empleado {
	
	String nombre;
	double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	void addSueldo(double porcentaje){
		this.sueldo = this.sueldo * porcentaje;
	}
	

}
