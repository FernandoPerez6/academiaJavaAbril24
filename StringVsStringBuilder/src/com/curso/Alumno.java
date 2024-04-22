package com.curso;

import java.util.Objects;

public class Alumno extends Object {
	
	String nombre;
	int edad;
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		Alumno other = (Alumno) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	

}
