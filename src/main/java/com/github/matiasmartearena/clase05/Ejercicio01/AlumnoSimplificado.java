package com.github.matiasmartearena.clase05.Ejercicio01;

public class AlumnoSimplificado {

	private String nombre;
	private String mail;

	/*----------------------------------------------------------------------------*/

	public AlumnoSimplificado(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "\n\t\t" + nombre + ", " + mail;
	}

}
