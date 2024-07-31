package com.github.grupo2.clase08;

import java.util.ArrayList;
import java.util.List;

public class ExamenDeMoto extends Examen {

	private static final int TOPE_CILINDRADA = 150;
	private static final int TIEMPO_MAXIMO_PERMITIDO = 120;
	private Moto moto;
	private List<Circuito> circuitos = new ArrayList<>();

	public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
		super(fecha, persona);
		this.moto = moto;
		this.circuitos = new ArrayList<>();
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public List<Circuito> getCircuitos() {
		return circuitos;
	}

	public void setCircuitos(List<Circuito> circuitos) {
		this.circuitos = circuitos;
	}

	// ---------------- Metodos ------------------ //
	
	@Override
	public boolean esAprobado() {
		if (this.moto.getCilindrada() > TOPE_CILINDRADA) {
			return this.apruebaExamenMotoAltaCilindrada();
		} else {
			return this.apruebaExamenMotoBajaCilindrada();
		}
	}

	private int cantCircuitosDesaprobados() {
    	int cantCircuitosDesaprobados = 0;
        for (Circuito circuito : circuitos) {
            if (!circuito.esAprobado()) {
                cantCircuitosDesaprobados++;
            }
        }
        return cantCircuitosDesaprobados;
    }

	private boolean apruebaExamenMotoAltaCilindrada() {
		return (this.cantCircuitosDesaprobados() == 0);
	}

	private boolean apruebaExamenMotoBajaCilindrada() {
		return (this.cantCircuitosDesaprobados() <= 1 && this.cumpleTiempoTotal());
	}

	public int getTiempoDeCircuitos() {
		int tiempo = 0;
		for (Circuito circuito : circuitos) {
			tiempo += circuito.getTiempoEnSeg();
		}
		return tiempo;
	}

	private boolean cumpleTiempoTotal() {
		return (this.getTiempoDeCircuitos() <= TIEMPO_MAXIMO_PERMITIDO);
	}

	public void agregarCircuito(Circuito circuito) {
		circuitos.add(circuito);
		
	}
}
