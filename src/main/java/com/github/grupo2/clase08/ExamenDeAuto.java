package com.github.grupo2.clase08;

/**
 * Clase que representa un examen para licencia de auto, extendiendo la clase
 * Examen.
 */
public class ExamenDeAuto extends Examen {

	// Constante que define el tiempo máximo permitido para el examen en segundos
	private static final int TIEMPO_MAXIMO_PERMITIDO = 90;

	// Atributos específicos de ExamenDeAuto
	private Circuito circuito;
	private Auto auto;

	/**
	 * Constructor de ExamenDeAuto.
	 * 
	 * @param fecha    Fecha del examen
	 * @param persona  Persona que realiza el examen
	 * @param circuito Circuito en el que se realiza el examen
	 * @param auto     Auto utilizado en el examen
	 */
	public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
		super(fecha, persona);
		this.circuito = circuito;
		this.auto = auto;
	}

	// Getters y setters

	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	// ---------------- Métodos ------------------ //

	/**
	 * Obtiene el tiempo que tomó completar el circuito.
	 * 
	 * @return Tiempo en segundos
	 */
	public int getTiempoDeCircuito() {
		return this.circuito.getTiempoEnSeg();
	}

	/**
	 * Determina si el examen está aprobado. El examen se considera aprobado si el
	 * circuito fue aprobado y el tiempo total no excede el tiempo máximo permitido.
	 * 
	 * @return true si el examen está aprobado, false en caso contrario
	 */
	@Override
	public boolean esAprobado() {
		return (this.circuito.esAprobado() && this.getTiempoDeCircuito() <= TIEMPO_MAXIMO_PERMITIDO);
	}
}
