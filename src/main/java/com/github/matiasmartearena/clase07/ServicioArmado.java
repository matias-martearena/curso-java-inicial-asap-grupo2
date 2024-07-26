package com.github.matiasmartearena.clase07;

public class ServicioArmado extends Servicio {
    private static final double VALORHORA = 250;

    public ServicioArmado(double horas) {
        super(horas);
    }

    // TODO:
    @Override
    public double calcularFacturacion() {
        return 1.12;
    }

    @Override
    public double getValorHora() {
        return VALORHORA;
    }

}
