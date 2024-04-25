package com.curso.v2;

public class ConexionDB {
	
	String name;
	private static ConexionDB conexion = new ConexionDB("Mysql");

	private ConexionDB(String name) {
		this.name = name;
	}
	
	static ConexionDB getInstance() {
		return conexion;
	}

	@Override
	public String toString() {
		return "ConexionDB [name=" + name + "]";
	}
	
}
