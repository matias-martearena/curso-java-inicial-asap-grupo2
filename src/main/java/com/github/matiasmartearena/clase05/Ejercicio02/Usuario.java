package com.github.matiasmartearena.clase05.Ejercicio02;

public class Usuario {
	private String id;
	private String nombre;
	private String email;
	private boolean esBecado;

	public Usuario(String id, String nombre, String email, boolean esBecado) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.esBecado = esBecado;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isEsBecado() {
		return esBecado;
	}

	public void setEsBecado(boolean esBecado) {
		this.esBecado = esBecado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public boolean esBecado() {
		return esBecado;
	}
}
