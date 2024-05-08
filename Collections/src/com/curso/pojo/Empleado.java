package com.curso.pojo;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;
    private String puesto;

    // Constructor de la clase
    public Empleado(String nombre, int edad, double salario, String departamento, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    @Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre);
	}

	// Método toString
    @Override
    public String toString() {
        return "Empleado{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", salario=" + salario +
               ", departamento='" + departamento + '\'' +
               ", puesto='" + puesto + '\'' +
               '}';
    }

//	@Override
//	public int compareTo(Empleado o) {
//		if (this.salario > o.salario)
//			return 5;
//		else if  (this.salario < o.salario)
//			return -5;
//		else
//			return 0;
//	}
	
	@Override
	public int compareTo(Empleado o) {
		return (int)(o.salario - this.salario);
	}
}
