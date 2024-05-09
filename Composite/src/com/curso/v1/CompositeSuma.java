package com.curso.v1;

                                      //IS-A
public class CompositeSuma implements Component {
	
	//HAS-A
	private Component compLeft;
	private Component compRight;
	
	public CompositeSuma(Component compLeft, 
							Component compRight) {
		this.compLeft = compLeft;
		this.compRight = compRight;
	}

	@Override
	public double getValor() {
		double r = compLeft.getValor() 
						+ compRight.getValor();
		return r;
	}

}
