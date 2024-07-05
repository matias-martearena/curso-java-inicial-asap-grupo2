package com.github.matiasmartearena.clase01;

import ar.edu.ort.p1.util.Consola;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		System.out.println("Ingrse un numero entero");
		
		int numero = Consola.leerEntero();
		
		if (numero % 2 == 0 && numero % 3 == 0) {
			System.out.println("El numero es multiplo de 2 y 3");
		} else {
			System.out.println("El numero no es multiplo de 2 y 3");
		}
	}
}