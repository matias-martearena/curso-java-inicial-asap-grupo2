package com.github.matiasmartearena.clase03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese el " + (i + 1) + " valor de 5: ");
			numeros[i] = input.nextInt();
		}

		if (numeros[0] == numeros[4] && numeros[1] == numeros[3] && numeros[2] == numeros[2]) {
			System.out.println("El array es capicua :)");
		} else {
			System.out.println("El array no es capicua :(");
		}

		input.close();
	}
}