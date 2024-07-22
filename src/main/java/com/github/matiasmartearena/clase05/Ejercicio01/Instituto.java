package com.github.matiasmartearena.clase05.Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

	private List<Carrera> carreras;

	/*----------------------------------------------------------------------------*/

	public Instituto() {
		this.carreras = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
	}

}
