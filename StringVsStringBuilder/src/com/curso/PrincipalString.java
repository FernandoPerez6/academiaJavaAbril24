package com.curso;

public class PrincipalString {
	
	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder("Filologo");
		
		for (int x=0; x<1000000; x++) {
			name.append(x);
			System.out.println(name);
		}
		
		String nombre = name.toString();
	}

}
