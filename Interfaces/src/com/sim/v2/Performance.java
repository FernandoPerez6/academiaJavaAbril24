package com.sim.v2;

interface Speak { 
	default  int talk(){
		return 5;
	}
}


public class Performance implements Speak { 
	
	public static void main(String[] notes) {
		System.out.println(new Performance().talk());
		
	}
}