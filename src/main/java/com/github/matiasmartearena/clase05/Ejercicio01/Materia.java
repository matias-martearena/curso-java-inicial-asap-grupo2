package com.github.matiasmartearena.clase05.Ejercicio01;

public class Materia {

	private String nombre;
	private String cuatrimestre;
	private Estado estado;

	/*----------------------------------------------------------------------------*/

	public Materia(String nombre, String cuatrimestre, Estado estado) {
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
		this.estado = estado;
	}

	/*----------------------------------------------------------------------------*/

	public Estado getEstado() {
		return estado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCuatrimestre() {
		return cuatrimestre;
	}

}
