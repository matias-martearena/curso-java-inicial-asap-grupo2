package com.github.matiasmartearena.clase06.Ejercicio01;

public class EmpleadoComision extends Empleado {

	private int clientes;
	private int monto;

	/* ---------------------------------------------------------------- */

	public EmpleadoComision(int dni, String nombre, String apellido, int ingreso, double salario, int clientes,
			int monto) {
		super(dni, nombre, apellido, ingreso, salario);
		this.clientes = clientes;
		this.monto = monto;
	}

	/* ---------------------------------------------------------------- */

	@Override
	public double mostrarSalario() {
		double salarioCalculado = clientes * monto;
		if (salarioCalculado < 20000) {
			salarioCalculado = 20000;
		}
		return salarioCalculado;
	}

	/* ---------------------------------------------------------------- */

	public int getClientes() {
		return clientes;
	}

	public void setClientes(int clientes) {
		this.clientes = clientes;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonton(int monto) {
		this.monto = monto;
	}
}