package com.github.matiasmartearena.clase01;

import ar.edu.ort.p1.util.Consola;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		int nota = Consola.leerEntero("Ingrese una nota...");

		if (nota < 0 || nota > 10) {
			System.out.println("La nota debe estar entre 0 y 10");
		} else if (nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota < 6) {
			System.out.println("Suficiente");
		} else if (nota < 7) {
			System.out.println("Bien");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
	}
}

