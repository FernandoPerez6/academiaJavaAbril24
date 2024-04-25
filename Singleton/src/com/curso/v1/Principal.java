package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

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
