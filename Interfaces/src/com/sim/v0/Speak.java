package com.sim.v0;

public interface Speak {
		
	default int defaultTalk() {
		return 7;
	}
	
	static int staticTalk() {
		return 77;
	}

}
