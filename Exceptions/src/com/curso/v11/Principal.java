package com.curso.v11;

public class Principal {
	
	public static void main(String[] args){
		ConexionMongoDb con = new ConexionMongoDb();
		
		try {
			con.open();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Fin de Programa");
	}

}
