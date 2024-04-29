package com.curso.v1;

public class ComputadoraLinux {
	
	String version;

	public ComputadoraLinux(String version) {
		this.version = version;
	}
	
	void encender() {
		System.out.println("Encender Linux: "+version);
	}
	

}
