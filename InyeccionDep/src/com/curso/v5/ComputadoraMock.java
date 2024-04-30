package com.curso.v5;

public class ComputadoraMock implements Computadora {
	
	String version;

	public ComputadoraMock(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender Compu Patito: "+version);
	}
	

}
