package com.github.matiasmartearena.clase01;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio04 {

	public static void main(String[] args) {

		int year = Consola.leerEntero("Ingrese un año...");

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
	}
}