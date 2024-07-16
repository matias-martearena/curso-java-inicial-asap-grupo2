package com.github.matiasmartearena.clase04;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese un numero entero: ");
		int numero = input.nextInt();

		if (esPrimo(numero)) {
			System.out.print("El numero es primo :)");
		} else {
			System.out.print("El numero no es primo :(");
		}

		input.close();
	}

	public static boolean esPrimo(int numero) {

		int divisores = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores++;
			}
		}

		if (divisores == 2 || numero == 1) {
			return true;
		} else {
			return false;
		}
	}

}