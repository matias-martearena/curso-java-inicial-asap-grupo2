package com.github.matiasmartearena.clase02;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio02 {

	public static void main(String[] args) {

		int numeroUno = Consola.leerEntero("Ingresa el primer numero...");
		int numeroDos = Consola.leerEntero("Ingresa el segundo numero...");
		int resultadoUno = 0;
		int resultadoDos = 0;

		if (numeroUno <= 0 || numeroDos <= 0) {
			System.out.print("Los numeros deben ser positivos y distinto de 0");
		}

		if (numeroUno > 0 && numeroDos > 0) {
			for (int i = 1; i < numeroUno; i++) {
				if (numeroUno % i == 0) {
					resultadoUno += i;
				}
			}

			for (int i = 1; i < numeroDos; i++) {
				if (numeroDos % i == 0) {
					resultadoDos += i;
				}
			}

			System.out.println("El resultado de la suma de los divisores de " + numeroUno + " es: " + resultadoUno);
			System.out.println("El resultado de la suma de los divisores de " + numeroDos + " es: " + resultadoDos);
		}

		if (numeroUno == resultadoDos && numeroDos == resultadoUno) {
			System.out.println("Los numeros: " + numeroUno + " y " + numeroDos + " son amigos :)");
		} else {
			System.out.println("Los numeros: " + numeroUno + " y " + numeroDos + " no son amigos :(");
		}

	}
}