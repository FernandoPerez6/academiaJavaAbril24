package com.curso.v2;

public class ComputadoraWindows implements Computadora {
	
	String version;

	public ComputadoraWindows(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender Windows: "+version);
	}
	

}
