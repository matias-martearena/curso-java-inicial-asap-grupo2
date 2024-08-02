package com.github.grupo2.clase08;

import com.google.gson.Gson;

/**
 * Clase que representa un Informe con estadísticas sobre examenes de conducir.
 */
public class Informe {

	private double porcReprobados;
	private double promTiempoAutosAprobados;

	/**
	 * Constructor de la clase Informe.
	 * 
	 * @param porcReprobados           Porcentaje de examenes reprobados
	 * @param promTiempoAutosAprobados Promedio de tiempo de los examenes de autos
	 *                                 aprobados
	 */
	public Informe(double porcReprobados, double promTiempoAutosAprobados) {
		this.porcReprobados = porcReprobados;
		this.promTiempoAutosAprobados = promTiempoAutosAprobados;
	}

	// Métodos getters y setters

	public double getPorcReprobados() {
		return porcReprobados;
	}

	public void setPorcReprobados(double porcReprobados) {
		this.porcReprobados = porcReprobados;
	}

	public double getPromTiempoAutosAprobados() {
		return promTiempoAutosAprobados;
	}

	public void setPromTiempoAutosAprobados(double promTiempoAutosAprobados) {
		this.promTiempoAutosAprobados = promTiempoAutosAprobados;
	}

	/**
	 * Sobrescribe el método toString para devolver una representación JSON del
	 * objeto.
	 * 
	 * @return Representación JSON del objeto Informe
	 */
	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this, Informe.class);
	}
}