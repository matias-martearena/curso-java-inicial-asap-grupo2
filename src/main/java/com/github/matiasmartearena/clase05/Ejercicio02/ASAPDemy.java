package com.github.matiasmartearena.clase05.Ejercicio02;

import java.util.HashMap;
import java.util.Map;

public class ASAPDemy {
	private Map<String, Usuario> usuarios;
	private Map<String, Categoria> categorias;

	public ASAPDemy() {
		this.usuarios = new HashMap<>();
		this.categorias = new HashMap<>();
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.put(usuario.getId(), usuario);
	}

	public void agregarCategoria(Categoria categoria) {
		categorias.put(categoria.id, categoria);
	}

	public Curso buscarCurso(String idCurso) {
		for (Categoria categoria : categorias.values()) {
			Curso curso = categoria.buscarCurso(idCurso);
			if (curso != null) {
				return curso;
			}
		}
		return null;
	}

	public Usuario buscarUsuario(String idUsuario) {
		return usuarios.get(idUsuario);
	}

	public Resultado suscribirseACurso(String idUsuario, String idCurso) {
		Curso curso = buscarCurso(idCurso);
		if (curso == null) {
			return Resultado.CURSO_INEX;
		}

		Usuario usuario = buscarUsuario(idUsuario);
		if (usuario == null) {
			return Resultado.USUARIO_INEX;
		}

		if (curso.getAutor().getId().equals(idUsuario)) {
			return Resultado.ES_AUTOR;
		}

		if (curso.estaSuscripto(usuario)) {
			return Resultado.YA_SUSCRIPTO;
		}

		if (usuario.esBecado() && curso.cupoBecadosLleno()) {
			return Resultado.MAX_BECADOS;
		}

		curso.suscribir(usuario);
		return Resultado.SUSCRIPTO_OK;
	}
}
