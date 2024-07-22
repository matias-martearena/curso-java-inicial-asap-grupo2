package com.github.matiasmartearena.clase05.Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Informe {

	private int cant;
	private List<AlumnoSimplificado> alumnos;

	/*----------------------------------------------------------------------------*/

	public Informe(int maxCantAprobadas) {
		this.cant = maxCantAprobadas;
		this.alumnos = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void addAlumnoSimplificado(AlumnoSimplificado alumnoSimplificado) {
		this.alumnos.add(alumnoSimplificado);
	}

	@Override
	public String toString() {
		return "Informe {\n\tMaximo nro de materias aprobadas por un alumno: " + cant + "\n\talumnos=" + alumnos
				+ "\n}";
	}

}
