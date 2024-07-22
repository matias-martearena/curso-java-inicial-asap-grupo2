package com.github.matiasmartearena.clase05;

import java.util.HashMap;
import java.util.Map;

public class Categoria {
	public String id;
	private String nombre;
	private Map<String, Curso> cursos;

	public Categoria(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new HashMap<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Map<String, Curso> cursos) {
		this.cursos = cursos;
	}

	public Curso buscarCurso(String id) {
		return cursos.get(id);
	}

	public void agregarCurso(Curso curso) {
		cursos.put(curso.getId(), curso);
	}
}
