package com.github.matiasmartearena.clase05;

public class Leccion {
	private String nombre;
	private int duracion;
	private TipoDeLeccion tipo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public TipoDeLeccion getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeLeccion tipo) {
		this.tipo = tipo;
	}

	public Leccion(String nombre, int duracion, TipoDeLeccion tipo) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.tipo = tipo;
	}
}
