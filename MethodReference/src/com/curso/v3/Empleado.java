package com.curso.v3;

public class Empleado {
	
	String nombre;
	double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	static void addSueldo(Empleado e, double porcentaje){
		e.sueldo = e.sueldo * porcentaje;
	}
	

}
