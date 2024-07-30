package com.github.grupo2.clase08.diagrama;

import java.util.List;

public class ExamenDeMoto extends Examen {

    private static final int TOPE_CILINDRADA = 150;
    private static final int TIEMPO_MAXIMO_PERMITIDO = 120;
    private Moto moto;
    private List<Circuito> circuitos;

    public ExamenDeMoto(String fecha, Persona persona, Moto moto, List<Circuito> circuitos) {
        super(fecha, persona);
        this.moto = moto;
        this.circuitos = circuitos;
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

    // -------------- Metodos

    public boolean esAprobado() {
        // TODO: falta terminar la logica

        int cantCircuitosDesaprobados = 0;

        for (Circuito circuito : circuitos) {

        }
    }

    private int cantCircuitosAprobados() {
        // Falta logica
        return 1;
    }

    private boolean apruebaExamenMotoAltaCilindrada() {
        // Falta logica
        return true;
    }

    private boolean apruebaExamenMotoBajaCilindrada() {
        // Falta logica
        return true;
    }

    private boolean cumpleTiempoTotal() {
        // Falta logica
        return true;
    }
}
