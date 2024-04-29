package com.curso.v0;

public class ComputadoraWindows {
	
	String version;

	public ComputadoraWindows(String version) {
		this.version = version;
	}
	
	void encender() {
		System.out.println("Encender Windows: "+version);
	}
	

}
