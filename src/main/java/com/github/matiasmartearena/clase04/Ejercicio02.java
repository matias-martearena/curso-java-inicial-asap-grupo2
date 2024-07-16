package com.github.matiasmartearena.clase04;

public class Ejercicio02 {

	public static void main(String[] args) {

		final int CANT_ELEMENTOS = 8;
		int numerosAleatorios[] = new int[CANT_ELEMENTOS];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (int) (Math.random() * 10 + 1);
		}

		// Muestra el array original
		System.out.print("\nArray desordenado: ");

		for (int i = 0; i < numerosAleatorios.length; i++) {
			System.out.print(numerosAleatorios[i] + " ");
		}

		// Algoritmo de ordenamiento burbuja
		for (int i = 0; i < numerosAleatorios.length - 1; i++) {
			for (int j = 0; j < (numerosAleatorios.length - 1 - i); j++) {
				if (numerosAleatorios[j] > numerosAleatorios[j + 1]) {
					int aux = numerosAleatorios[j];
					numerosAleatorios[j] = numerosAleatorios[j + 1];
					numerosAleatorios[j + 1] = aux;
				}
			}
		}

		// Muestra el array ordenado
		System.out.print("\nArray ordenado: ");

		for (int i = 0; i < numerosAleatorios.length; i++) {
			System.out.print(numerosAleatorios[i] + " ");
		}

	}
}