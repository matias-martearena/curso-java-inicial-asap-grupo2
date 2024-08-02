package com.github.grupo2.clase08;

/**
 * Clase que representa un Auto, el cual es un tipo específico de Vehículo.
 * Extiende la clase Vehiculo y añade una característica específica de los
 * autos.
 */
public class Auto extends Vehiculo{

    private int cantPuertas;
    
	/**
	 * Constructor de la clase Auto.
	 * 
	 * @param patente      Número de patente del auto
	 * @param marca        Marca del auto
	 * @param cilindrada   Cilindrada del motor del auto
	 * @param cantPuertas  Indica la cantidad de puertas del auto
	 */
    public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
        super(patente, marca, cilindrada);
        this.cantPuertas = cantPuertas;
    }
    
    // Métodos getter y setter del atributo cantPuertas
    
    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
}
