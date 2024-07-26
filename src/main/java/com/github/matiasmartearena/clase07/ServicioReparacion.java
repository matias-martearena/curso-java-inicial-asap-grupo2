package com.github.matiasmartearena.clase07;

import com.github.sanchezih.util.math.Matematica;

public class ServicioReparacion extends Servicio {
    private int dificultad;
    private static final double VALORHORA = 180;

    public ServicioReparacion(int dificultad, double horas) {
        super(horas);
        this.dificultad = dificultad;
    }

    @Override
    public double calcularPrecio() {
        double calPrecio = super.calcularPrecio();
        return this.dificultad > 3 ? Matematica.sumarPorcentaje(calPrecio, 1.25) : calPrecio;
    }

    @Override
    public double calcularFacturacion() {
        return 1.12;
    }

    @Override
    public double getValorHora() {
        return VALORHORA;
    }
}
