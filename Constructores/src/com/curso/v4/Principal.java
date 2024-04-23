package com.curso.v4;

class Base {
	//Base(){}
    public Base(String s) {
        System.out.println("Base constructor");
    }
}

class Derived extends Base {
    public Derived() {
    	super("algo");
        System.out.println("Derived constructor");
    }
}


public class Principal {
	
	public static void main(String[] args) {
		Derived d = new Derived();
	}
	//Base
	//Derived
}
