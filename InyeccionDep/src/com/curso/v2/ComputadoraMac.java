package com.curso.v2;

public class ComputadoraMac implements Computadora {
	
	String version;

	public ComputadoraMac(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender Mac: "+version);
	}
	

}
