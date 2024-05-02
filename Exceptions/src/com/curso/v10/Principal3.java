package com.curso.v10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal3 {

	public static void main(String[] args) {
		
		Connection conn = null; 
		Statement stmt = null; 
		ResultSet rs = null; 
		try { 
		    conn = getConnection(); // Regresa un JDBC Connection 
		    stmt = conn.createStatement(); 
		    rs = stmt.executeQuery("select * from empleado"); 
		    // ejecuta consulta
		    // cierra rs, stmt, conn
		    // interta en pojos
		} catch (Exception e) { 
		    // maneja cualquier exception
		} 
	}

	static Connection getConnection() {
		return null;
	}

}
