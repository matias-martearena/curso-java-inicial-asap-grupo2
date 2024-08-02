package com.github.grupo2.clase08;

public class Persona {

	/**
	 * Clase que representa a una Persona. Contiene información básica como DNI,
	 * nombre y apellido.
	 */

	private String dni;
	private String nombre;
	private String apellido;

	public Persona(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Métodos getters y setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
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
}
