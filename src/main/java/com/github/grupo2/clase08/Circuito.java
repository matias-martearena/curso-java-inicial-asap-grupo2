package com.github.grupo2.clase08;

/**
 * Representa un circuito de prueba para exámenes de conducción. Esta clase
 * implementa la interfaz Evaluable.
 */
public class Circuito implements Evaluable {

	/** Número máximo de faltas permitidas para aprobar el circuito. */
	private static final int MAX_FALTAS = 2;

	private int tiempoEnSeg;

	private int nroFaltas;

	/**
	 * Constructor para crear un nuevo Circuito.
	 *
	 * @param tiempoEnSeg Tiempo en segundos que tomó completar el circuito.
	 * @param nroFaltas   Número de faltas cometidas durante el recorrido el
	 *                    circuito..
	 */
	public Circuito(int tiempoEnSeg, int nroFaltas) {
		this.tiempoEnSeg = tiempoEnSeg;
		this.nroFaltas = nroFaltas;
	}

	// Métodos getters y setters

	/**
	 * Obtiene el tiempo en segundos que tomó completar el circuito.
	 *
	 * @return El tiempo en segundos.
	 */
	public int getTiempoEnSeg() {
		return tiempoEnSeg;
	}

	/**
	 * Establece el tiempo en segundos que tomó completar el circuito.
	 *
	 * @param tiempoEnSeg El nuevo tiempo en segundos.
	 */
	public void setTiempoEnSeg(int tiempoEnSeg) {
		this.tiempoEnSeg = tiempoEnSeg;
	}

	/**
	 * Obtiene el número de faltas cometidas durante el recorrido.
	 *
	 * @return El número de faltas.
	 */
	public int getNroFaltas() {
		return nroFaltas;
	}

	/**
	 * Establece el número de faltas cometidas durante el recorrido.
	 *
	 * @param nroFaltas El nuevo número de faltas.
	 */
	public void setNroFaltas(int nroFaltas) {
		this.nroFaltas = nroFaltas;
	}

	// ---------------- Metodos ------------------ //

	/**
	 * Determina si el circuito ha sido aprobado basándose en el número de faltas.
	 *
	 * @return true si el número de faltas es menor o igual al máximo permitido,
	 *         false en caso contrario.
	 */
	public boolean esAprobado() {
		return nroFaltas <= MAX_FALTAS;
	}
}
