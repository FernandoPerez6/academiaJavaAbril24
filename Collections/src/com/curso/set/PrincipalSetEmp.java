package com.curso.set;

import java.util.ArrayList;

import com.curso.pojo.Empleado;
import java.util.*;

public class PrincipalSetEmp {
	
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Juan Pérez", 30, 35000, "Contabilidad", "Contador");
        Empleado empleado2 = new Empleado("María López", 25, 30000, "Recursos Humanos", "Reclutadora");
        Empleado empleado3 = new Empleado("Carlos Jiménez", 40, 45000, "Tecnología", "Desarrollador Senior");
        Empleado empleado4 = new Empleado("Ana Rivera", 22, 28000, "Marketing", "Asistente de Marketing");
        Empleado empleado5 = new Empleado("Pedro Casas", 35, 32000, "Ventas", "Ejecutivo de Ventas");
        Empleado empleado6 = new Empleado("Sofía Castro", 28, 31000, "Atención al Cliente", "Supervisora");
        Empleado empleado7 = new Empleado("Ricardo Díaz", 45, 50000, "Dirección", "Director Financiero");
        Empleado empleado8 = new Empleado("Luisa Gómez", 33, 36000, "Operaciones", "Gerente de Operaciones");
		Empleado empleado9 = new Empleado("Juan Pérez", 30, 35000, "Contabilidad", "Contador");

        
        Set<Empleado> listaEmpleados = new HashSet<>();
        
        listaEmpleados.add(empleado1); 
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado9);

        for (Empleado e :listaEmpleados) {
        	System.out.println(e);
        }
        
        
	}

}
