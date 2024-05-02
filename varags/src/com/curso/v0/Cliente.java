package com.curso.v0;

public class Cliente {
	
	private String nombre;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public void asignarCuenta(String cta1) {
		System.out.println("Cuenta: "+cta1);
	}
	
	public void asignarCuenta(String cta1, String cta2) {
		System.out.println("Cuenta1: "+cta1);
		System.out.println("Cuenta2: "+cta2);
	}
	
	public void asignarCuenta(String cta1, String cta2, String cta3) {
		System.out.println("Cuenta1: "+cta1);
		System.out.println("Cuenta2: "+cta2);
		System.out.println("Cuenta3: "+cta3);
	}


}
