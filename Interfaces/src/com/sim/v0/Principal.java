package com.sim.v0;

import static com.sim.v0.Speak.staticTalk;

class ImpSpeak implements Speak{ }

public class Principal {

	public static void main(String[] args) {

		int r;
		
		r = staticTalk();
		
		System.out.println("static: "+r);
		
		r = new ImpSpeak().defaultTalk();
		
		System.out.println("default: "+r);

		r = new Speak(){}.defaultTalk();
		
		System.out.println("default: "+r);

	}

}
