package com.curso.v3;

public class Cliente {
	
	private String nombre;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public void asignarCuenta(String... ctas) {
		System.out.println("Entro a VarAgs: "+ctas.length);
		for(String cta : ctas) 
			System.out.println(cta);
		
	}
	
	public void asignarCuenta(int entero, String... ctas) {
		System.out.println(ctas[1]);
		
	}
	
}
