package com.github.matiasmartearena.clase06.Ejercicio01;

public abstract class Empleado {

	int dni;
	String nombre;
	String apellido;
	Integer ingreso;
	double salario;

	/* ---------------------------------------------------------------- */

	public Empleado(int dni, String nombre, String apellido, int ingreso, double salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ingreso = ingreso;
		this.salario = salario;
	}

	/* ---------------------------------------------------------------- */

	public abstract double mostrarSalario();

	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
	
	/* ---------------------------------------------------------------- */

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getIngreso() {
		return ingreso;
	}

	public void setIngreso(Integer ingreso) {
		this.ingreso = ingreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}