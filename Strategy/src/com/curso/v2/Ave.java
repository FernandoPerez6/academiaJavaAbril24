package com.curso.v2;

public abstract class Ave {
	
	//HAS-A
	String nombre; //Atributo, Propiedad, Un Estado
	ComportamientoVolar cv = new NoVolar(); //Interface

	public Ave(String nombre) {
		this.nombre = nombre;
	}
	
	abstract void volar();

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" "
				+ "[nombre=" + nombre + "]";
	}
	
}
