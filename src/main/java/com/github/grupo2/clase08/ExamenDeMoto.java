package com.github.grupo2.clase08;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un examen para licencia de moto, extendiendo la clase
 * Examen.
 */
public class ExamenDeMoto extends Examen {

	// Constantes de la clase
	private static final int TOPE_CILINDRADA = 150;
	private static final int TIEMPO_MAXIMO_PERMITIDO = 120;

	// Atributos específicos de ExamenDeMoto
	private Moto moto;
	private List<Circuito> circuitos;

	/**
	 * Constructor de ExamenDeMoto.
	 * 
	 * @param fecha   Fecha del examen
	 * @param persona Persona que realiza el examen
	 * @param moto    Moto utilizada en el examen
	 */
	public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
		super(fecha, persona);
		this.moto = moto;
		this.circuitos = new ArrayList<>();
	}

	// Getters y setters

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public List<Circuito> getCircuitos() {
		return circuitos;
	}

	public void setCircuitos(List<Circuito> circuitos) {
		this.circuitos = circuitos;
	}

	// ---------------- Métodos ------------------ //

	/**
	 * Determina si el examen está aprobado según la cilindrada de la moto.
	 * 
	 * @return true si el examen está aprobado, false en caso contrario
	 */
	@Override
	public boolean esAprobado() {
		if (this.moto.getCilindrada() > TOPE_CILINDRADA) {
			return this.apruebaExamenMotoAltaCilindrada();
		} else {
			return this.apruebaExamenMotoBajaCilindrada();
		}
	}

	/**
	 * Cuenta la cantidad de circuitos desaprobados.
	 * 
	 * @return Número de circuitos desaprobados
	 */
	private int cantCircuitosDesaprobados() {
		int cantCircuitosDesaprobados = 0;
		for (Circuito circuito : circuitos) {
			if (!circuito.esAprobado()) {
				cantCircuitosDesaprobados++;
			}
		}
		return cantCircuitosDesaprobados;
	}

	/**
	 * Determina si se aprueba el examen para motos de alta cilindrada.
	 * 
	 * @return true si se aprueba, false en caso contrario
	 */
	private boolean apruebaExamenMotoAltaCilindrada() {
		return (this.cantCircuitosDesaprobados() == 0);
	}

	/**
	 * Determina si se aprueba el examen para motos de baja cilindrada.
	 * 
	 * @return true si se aprueba, false en caso contrario
	 */
	private boolean apruebaExamenMotoBajaCilindrada() {
		return (this.cantCircuitosDesaprobados() <= 1 && this.cumpleTiempoTotal());
	}

	/**
	 * Calcula el tiempo total de todos los circuitos.
	 * 
	 * @return Tiempo total en segundos
	 */
	public int getTiempoDeCircuitos() {
		int tiempo = 0;
		for (Circuito circuito : circuitos) {
			tiempo += circuito.getTiempoEnSeg();
		}
		return tiempo;
	}

	/**
	 * Verifica si el tiempo total cumple con el máximo permitido.
	 * 
	 * @return true si cumple, false en caso contrario
	 */
	private boolean cumpleTiempoTotal() {
		return (this.getTiempoDeCircuitos() <= TIEMPO_MAXIMO_PERMITIDO);
	}

	/**
	 * Agrega un nuevo circuito al examen.
	 * 
	 * @param circuito Circuito a agregar
	 */
	public void agregarCircuito(Circuito circuito) {
		circuitos.add(circuito);
	}
}