package com.github.matiasmartearena.clase02;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio03 {

	public static void main(String[] args) {

		int numero;
		int sumaCifras = 0;

		do {
			numero = Consola.leerEntero("Ingrese un numero positivo...");
		} while (numero <= 0);

		while (numero > 0) {
			int cifra = numero % 10;
			sumaCifras += cifra;
			numero /= 10;
		}

		System.out.print("La suma de la sifra es: " + sumaCifras);
	}
}