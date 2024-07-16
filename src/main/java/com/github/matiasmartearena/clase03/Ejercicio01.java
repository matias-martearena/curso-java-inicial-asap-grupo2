package com.github.matiasmartearena.clase03;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese el numero de personas: ");

		int personas = input.nextInt();

		do {
			if (personas <= 0) {
				System.out.print("El numero de personas debe ser un entero positivo: ");
				personas = input.nextInt();
			}
		} while (personas <= 0);

		float[] alturas = new float[personas];
		float mediaAltura = 0;
		int superiorMedia = 0, inferiorMedia = 0;

		for (int i = 0; i < personas; i++) {
			System.out.println("Ingresa la altura de la persona " + (i + 1) + " con la sintaxis 'metro.cemtimetro': ");
			alturas[i] = input.nextFloat();
			mediaAltura += alturas[i];
		}

		mediaAltura /= personas;

		for (int i = 0; i < personas; i++) {
			if (alturas[i] < mediaAltura) {
				inferiorMedia++;
			} else {
				superiorMedia++;
			}
		}

		System.out.println("La altura media es: " + mediaAltura);
		System.out.println("La cantidad de personas con altura superior a la media es: " + superiorMedia);
		System.out.println("La cantidad de personas con altura inferior a la media es: " + inferiorMedia);

		input.close();
	}

}