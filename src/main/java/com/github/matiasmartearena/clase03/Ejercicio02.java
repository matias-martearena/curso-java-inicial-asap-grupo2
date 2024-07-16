package com.github.matiasmartearena.clase03;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		int maximoValor = 0, minimoValor = 0, posicionMaximo = 0, posicionMinimo = 0;

		System.out.println("Ingrese 10 numeros ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + ": ");
			numeros[i] = input.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximoValor) {
				maximoValor = numeros[i];
				posicionMaximo = i;
			}

			if (numeros[i] < minimoValor) {
				minimoValor = numeros[i];
				posicionMinimo = i;
			}
		}

		System.out.println("El maximo valor de los valores es " + maximoValor);
		System.out.println("La posicion en el array del valor maximo es " + posicionMaximo);
		System.out.println("El minimo valor de los valores es " + minimoValor);
		System.out.println("La posicion en el array del valor minimo es " + posicionMinimo);

		input.close();
	}
}