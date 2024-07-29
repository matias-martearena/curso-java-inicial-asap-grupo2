package com.github.matiasmartearena.clase07;

import com.github.sanchezih.util.math.Matematica;

import java.time.temporal.ValueRange;

public class ServicioReparacion extends Servicio {

    // ----------- Atributos ----------- //
    private int dificultad;
    private static final double VALOR_HORA = 180;
    private static final int LIMITE_SIMPLEZA = 2;
    private static final int MIN_DIFICULTAD = 3;
    private static final double INC_DIFICULTAD = 25;

    // ----------- Constructores ----------- //
    public ServicioReparacion(int dificultad, double horas) {
        super(horas);
        this.dificultad = dificultad;
    }

    // ----------- Getters y Setters ----------- //
    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    // ----------- Metodos ----------- //
    @Override
    public double calcularPrecio() {
        double calPrecio = super.calcularPrecio();
        return this.dificultad > MIN_DIFICULTAD ? Matematica.sumarPorcentaje(calPrecio, INC_DIFICULTAD) : calPrecio;
    }

    @Override
    public double getValorHora() {
        return VALOR_HORA;
    }

    public boolean esServicioSimple() {
        return this.dificultad <= LIMITE_SIMPLEZA;
    }
}
