package com.curso.v0;

public class Helper2 {
	
	public static <T> void printException(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		printException(Integer.valueOf(5));
		printException("Hello");
		printException(new StringBuilder("Hola"));
	}

}
