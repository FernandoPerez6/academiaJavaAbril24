package com.curso.map;

import com.curso.pojo.Empleado;
import java.util.*;

public class PrincipalMapEmpleado {
	
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Juan Pérez", 30, 35000, "Contabilidad", "Contador");
	    Empleado empleado2 = new Empleado("María López", 25, 30000, "Recursos Humanos", "Reclutadora");
	    Empleado empleado3 = new Empleado("Carlos Jiménez", 40, 45000, "Ventas", "Desarrollador Senior");
	    Empleado empleado4 = new Empleado("Ana Rivera", 22, 28000, "Contabilidad", "Asistente de Marketing");
	    Empleado empleado5 = new Empleado("Pedro Casas", 35, 32000, "Ventas", "Ejecutivo de Ventas");
	    Empleado empleado6 = new Empleado("Sofía Castro", 28, 31000, "Ventas", "Supervisora");
	    Empleado empleado7 = new Empleado("Ricardo Díaz", 45, 50000, "Recursos Humanos", "Director Financiero");
	    Empleado empleado8 = new Empleado("Luisa Gómez", 33, 36000, "Contabilidad", "Gerente de Operaciones");
	    
	    Map<String,List<Empleado>> mapaEmpDepto = new HashMap<>();
	    
	    List<Empleado> listaContabilidad = new ArrayList<>();
	    listaContabilidad.add(empleado1);
	    listaContabilidad.add(empleado4);
	    listaContabilidad.add(empleado8);

	    mapaEmpDepto.put("Contabilidad", listaContabilidad);
	    
	    List<Empleado> listaRecursosHumanos = new ArrayList<>();
	    listaRecursosHumanos.add(empleado2);
	    listaRecursosHumanos.add(empleado7);

	    mapaEmpDepto.put("Recursos Humanos", listaRecursosHumanos);
	    
	    List<Empleado> listaVentas = new ArrayList<>();
	    listaVentas.add(empleado3);
	    listaVentas.add(empleado5);
	    listaVentas.add(empleado6);

	    mapaEmpDepto.put("Ventas", listaVentas);
	    
	    System.out.println(mapaEmpDepto);
	    
	    System.out.println("***********");
	    
//	    for (List<Empleado> lista: mapaEmpDepto.values() ) {
//		    System.out.println("=========");
//	    	for (Empleado e : lista) {
//	    			System.out.println(e);
//	    	}
//	    }
	    
	    //PROGRAMACION IMPERATIVA
	    //DIME EL "QUE" Y EL "COMO"
	    for (String departamento :mapaEmpDepto.keySet()) {
	    	System.out.println("Depto: "+departamento);
	    	for (List<Empleado> lista: mapaEmpDepto.values() ) {
	    		for (Empleado e : lista) {
	    			if (departamento.equals(e.getDepartamento()))
	    			System.out.println(e);
	    		}
	    	}
	    }
	    
	    //SQL, PROGRAMACION DECLARATIVA
	    //DIME EL "QUE" PERO NO ME DIGAS EL "COMO"
	    
	    Map<Integer,Map<String,Queue<Empleado>>> mapaComplejo;
	    
	}
	
	
}
