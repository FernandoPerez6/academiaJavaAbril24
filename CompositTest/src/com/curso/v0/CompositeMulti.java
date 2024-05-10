package com.curso.v0;

public class CompositeMulti implements Component {
	
	Component componentLeft;
	Component componentRigth;

	public CompositeMulti(Component c1, Component c2) {
		componentLeft = c1;
		componentRigth = c2;
	}

	@Override
	public double getValor() {
		return componentLeft.getValor() * componentRigth.getValor();
	}

}
