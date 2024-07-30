package com.github.grupo2.clase08.diagrama;

public class Circuito implements Evaluable {

    private static final int MAX_FALTAS = 2;
    private int tiempoEnSeg;
    private int nroFaltas;

    public Circuito(int tiempoEnSeg, int nroFaltas) {
        this.tiempoEnSeg = tiempoEnSeg;
        this.nroFaltas = nroFaltas;
    }

    public int getTiempoEnSeg() {
        return tiempoEnSeg;
    }

    public void setTiempoEnSeg(int tiempoEnSeg) {
        this.tiempoEnSeg = tiempoEnSeg;
    }

    public int getNroFaltas() {
        return nroFaltas;
    }

    public void setNroFaltas(int nroFaltas) {
        this.nroFaltas = nroFaltas;
    }

    // ---------------- Metodos ------------------ //

    public boolean esAprobado() {
        return nroFaltas <= MAX_FALTAS;
    }
}
