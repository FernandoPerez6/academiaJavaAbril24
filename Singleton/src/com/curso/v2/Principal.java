package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("v2");

		String cliente1 = "Patrobas";
		String cliente2 = "Tercio";
		String cliente3 = "Andronico";

		ConexionDB con1 = ConexionDB.getInstance();
		ConexionDB con2 = ConexionDB.getInstance();
		ConexionDB con3 = ConexionDB.getInstance();
		ConexionDB con999 = ConexionDB.getInstance();

		System.out.println(con1==con2);
		System.out.println(con1==con999);


		
		
	}

}
