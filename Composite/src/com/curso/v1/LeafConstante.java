package com.curso.v1;

public class LeafConstante implements Component {
	
	private double constante;

	LeafConstante(double constante){
		this.constante = constante;
	}

	@Override
	public double getValor() {
		return constante;
	}

}
