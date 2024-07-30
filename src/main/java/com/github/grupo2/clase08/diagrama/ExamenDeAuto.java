package com.github.grupo2.clase08.diagrama;

public class ExamenDeAuto extends Examen {

    private static final int TIMEPO_MAXIMO_PERMITIDO = 90;
    private Circuito circuito;

    public ExamenDeAuto(String fecha, Persona persona, Circuito circuito) {
        super(fecha, persona);
        this.circuito = circuito;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    // ------------------- Metodos

    public boolean esAprobado() {
        // Falta logica
        return true;
    }

    public int getTiempoDeCircuito() {
        // Falta logica
        return 1;
    }

}
