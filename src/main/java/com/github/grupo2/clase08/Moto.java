package com.github.grupo2.clase08;

/**
 * Clase que representa una Moto, la cual es un tipo específico de Vehículo.
 * Extiende la clase Vehiculo y añade una característica específica de las
 * motos.
 */
public class Moto extends Vehiculo {

	private boolean tieneEspejos;

	/**
	 * Constructor de la clase Moto.
	 * 
	 * @param patente      Número de patente de la moto
	 * @param marca        Marca de la moto
	 * @param cilindrada   Cilindrada del motor de la moto
	 * @param tieneEspejos Indica si la moto tiene todos los espejos retrovisores
	 */
	public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
		super(patente, marca, cilindrada);
		this.tieneEspejos = tieneEspejos;
	}

	/**
	 * Verifica si la moto tiene espejos retrovisores.
	 * 
	 * @return true si la moto tiene todos los espejos, false en caso contrario
	 */
	public boolean isTieneEspejos() {
		return tieneEspejos;
	}

	/**
	 * Establece si la moto tiene o no espejos retrovisores.
	 * 
	 * @param tieneEspejos true si se quiere indicar que la moto tiene todos los
	 *                     espejos , false en caso contrario
	 */
	public void setTieneEspejos(boolean tieneEspejos) {
		this.tieneEspejos = tieneEspejos;
	}
}