package com.github.matiasmartearena.clase01;

import ar.edu.ort.p1.util.Consola;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		System.out.println("Ingresa tu fecha de nacimiento...");

		int day = Consola.leerEntero("dia: ");
		int month = Consola.leerEntero("mes: ");
		int year = Consola.leerEntero("año: ");

		int total = day + month + year;

		int cifra1 = total / 1000;
		int cifra2 = total / 100 % 10;
		int cifra3 = total / 10 % 10;
		int cifra4 = total % 10;
		
		int suerte = cifra1 + cifra2 + cifra3 + cifra4;

		System.out.println("Su numero de la suerte es: " + suerte);
	}
}