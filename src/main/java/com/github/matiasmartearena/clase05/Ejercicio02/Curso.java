package com.github.matiasmartearena.clase05.Ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	public static final int MAX_BECADOS = 5;
	private String id;
	private String titulo;
	private double precio;
	private int valoracion;
	private Usuario autor;
	private List<Usuario> suscriptores;
	private List<Leccion> lecciones;

	public Curso(String id, String titulo, double precio, int valoracion, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.autor = autor;
		this.suscriptores = new ArrayList<>();
		this.lecciones = new ArrayList<>();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public List<Usuario> getSuscriptores() {
		return suscriptores;
	}

	public void setSuscriptores(List<Usuario> suscriptores) {
		this.suscriptores = suscriptores;
	}

	public List<Leccion> getLecciones() {
		return lecciones;
	}

	public void setLecciones(List<Leccion> lecciones) {
		this.lecciones = lecciones;
	}

	public String getId() {
		return id;
	}

	public Usuario getAutor() {
		return autor;
	}

	public boolean estaSuscripto(Usuario usuario) {
		return suscriptores.contains(usuario);
	}

	public boolean cupoBecadosLleno() {
		return suscriptores.stream().filter(Usuario::esBecado).count() >= MAX_BECADOS;
	}

	public void suscribir(Usuario usuario) {
		suscriptores.add(usuario);
	}
}
