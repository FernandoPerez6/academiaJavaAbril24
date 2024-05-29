package com.sim.v1;

interface Speak { 
	default int talk(){
		return 7;
	}
}
interface Sing {
	default int talk(){
		return 5;
	}
}

public class Performance implements Speak, Sing {
	
	public int talk(String... x) {
		return x.length;
	} 
	
	@Override
	public int talk() {
		//return 1;
		return new Sing(){}.talk();
	} 
	
	public static void main(String[] notes) {
		System.out.println(new Performance().talk());
		
		
	}
}