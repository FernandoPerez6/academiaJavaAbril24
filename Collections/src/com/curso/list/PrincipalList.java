package com.curso.list;

import java.util.ArrayList;

import com.curso.pojo.Empleado;
import java.util.*;

public class PrincipalList {
	
	public static void main(String[] args) {
		
		boolean res;
		
		Empleado empleado1 = new Empleado("Juan Pérez", 30, 35000, "Contabilidad", "Contador");
        Empleado empleado2 = new Empleado("María López", 25, 30000, "Recursos Humanos", "Reclutadora");
        Empleado empleado3 = new Empleado("Carlos Jiménez", 40, 45000, "Tecnología", "Desarrollador Senior");
        Empleado empleado4 = new Empleado("Ana Rivera", 22, 28000, "Marketing", "Asistente de Marketing");
        Empleado empleado5 = new Empleado("Pedro Casas", 35, 32000, "Ventas", "Ejecutivo de Ventas");
        Empleado empleado6 = new Empleado("Sofía Castro", 28, 31000, "Atención al Cliente", "Supervisora");
        Empleado empleado7 = new Empleado("Ricardo Díaz", 45, 50000, "Dirección", "Director Financiero");
        Empleado empleado8 = new Empleado("Luisa Gómez", 33, 36000, "Operaciones", "Gerente de Operaciones");

        
        List<Empleado> listaEmpleados = new ArrayList<>();
        
        //res = listaEmpleados.add(empleado1);
        //System.out.println(res);
        
        listaEmpleados.add(empleado1); // <== 0
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4); //<== 3
        listaEmpleados.add(empleado5);
        listaEmpleados.add(empleado6);
        
        listaEmpleados.add(3,empleado8);
        
        //System.out.println(listaEmpleados.get(3));
        
        //System.out.println(listaEmpleados.get(6));
        
        for (Empleado e :listaEmpleados) {
        	//System.out.println(e);
        }
        
        for (int x=0;x<listaEmpleados.size();x++) {
        	Empleado e = listaEmpleados.get(x);
        	System.out.println(e);
        	System.out.println(listaEmpleados.indexOf(e));
        }
        
        
	}

}
