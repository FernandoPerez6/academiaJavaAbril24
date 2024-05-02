package com.curso.v2;

public class Cliente {
	
	private String nombre;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public void asignarCuenta(String... ctas) {
		for(String cta : ctas) 
			System.out.println(cta);
		
	}
	
}
