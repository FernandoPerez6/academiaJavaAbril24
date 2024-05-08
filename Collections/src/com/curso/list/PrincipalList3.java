package com.curso.list;

import java.util.ArrayList;

import com.curso.pojo.Empleado;
import java.util.*;

public class PrincipalList3 {
	
	public static void main(String[] args) {
		
		Empleado[] arregloEmpleado = {
		new Empleado("Juan Pérez", 30, 35000, "Contabilidad", "Contador"),
        new Empleado("María López", 25, 30000, "Recursos Humanos", "Reclutadora"),
        new Empleado("Carlos Jiménez", 40, 45000, "Tecnología", "Desarrollador Senior"),
        new Empleado("Ana Rivera", 22, 28000, "Marketing", "Asistente de Marketing"),
        new Empleado("Pedro Casas", 35, 32000, "Ventas", "Ejecutivo de Ventas"),
        new Empleado("Sofía Castro", 28, 31000, "Atención al Cliente", "Supervisora"),
        new Empleado("Ricardo Díaz", 45, 50000, "Dirección", "Director Financiero"),
        new Empleado("Luisa Gómez", 33, 36000, "Operaciones", "Gerente de Operaciones")};

        
        List<Empleado> listaEmpleados = new ArrayList<>(Arrays.asList(arregloEmpleado));
        
        //listaEmpleados.get(4).setNombre("Neto Casas");
        Empleado e1 = listaEmpleados.get(4);
        e1.setNombre("Neto Casas");
        
        listaEmpleados.remove(0);
        e1 = new Empleado("Patrobas Gómez", 33, 36000, "Operaciones", "Gerente de Operaciones");
        listaEmpleados.add(e1);
        
        //listaEmpleados.forEach(System.out::println);
        for (Empleado e:listaEmpleados)
        	System.out.println(e);
        
        
        
	}

}
