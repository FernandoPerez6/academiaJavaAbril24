package com.curso.v1;

public class ConexionDB {
	
	String name;
	private static ConexionDB conexion;

	private ConexionDB(String name) {
		this.name = name;
	}
	
	static ConexionDB getInstance() {
		if (conexion == null) {
			conexion = new ConexionDB("Mysql");
			return conexion;
		}
		else 
			return conexion;
	}

	@Override
	public String toString() {
		return "ConexionDB [name=" + name + "]";
	}

	
}
