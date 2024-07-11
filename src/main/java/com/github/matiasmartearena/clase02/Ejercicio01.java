package com.github.matiasmartearena.clase02;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio01 {

	public static void main(String[] args) {

		int numero = Consola.leerEntero("Introduce un numero entero...");
		int primer = 0; // Primer numero de la secuencia
		int segundo = 1; // Segundo numero de la secuencia

		System.out.print("Los " + numero + " primeros números de la serie de Fibonacci son: ");

		for (int i = 0; i < numero; i++) {
			System.out.print(primer + " "); // Imprime el primer numero de la secuencia

			int resultado = primer + segundo;
			primer = segundo;
			segundo = resultado;
		}
	}
}