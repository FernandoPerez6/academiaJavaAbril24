package com.curso.v0;

public class Empleado {
	
	String nombre;
	double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	static void addSueldo(Empleado e){
		e.sueldo = e.sueldo * 1.10;
	}
	
	static boolean isRich(Empleado e) {
		return e.sueldo > 1_000;
	}
	
	static boolean isRichWithIncrement(Empleado e, double incremento) {
		e.sueldo = e.sueldo + incremento;
		return e.sueldo > 1_000;
	}
	

}
