package com.curso.v0;

public class Helper3 {
	
	public static <T extends Exception> void printException(T t) {
		System.out.println(t.getMessage());
	}
	
	public static void main(String[] args) {
		
		int i = 4;
		String s1 = ""+ i + 1 ; //41
		String s2 = i + 1 + ""; //5
		
		char c = 'a'; //
		System.out.println(c);
		String s3 = c + i + 1 + "" ;
		
		System.out.println(s1);
		System.out.println(s2);

		
		printException(new Exception("B"));
		Helper3.<Exception>printException(new Exception("B"));
		
		Helper3.printException(new java.io.FileNotFoundException("A"));
		Helper3.<java.io.FileNotFoundException>printException(new java.io.FileNotFoundException("Z"));
		Helper3.<Exception>printException(new java.io.FileNotFoundException("Z"));
		
		//Helper.<Throwable>printException(new Exception("C"));
		Helper3.<NullPointerException>printException(new NullPointerException("D"));
		//Helper3.printException(new Throwable("E"));

		
//		printException(Integer.valueOf(5));
//		printException("Hello");
//		printException(new StringBuilder("Hola"));
	}

}
