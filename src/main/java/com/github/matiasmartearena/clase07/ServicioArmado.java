package com.github.matiasmartearena.clase07;

public class ServicioArmado extends Servicio {

    // ----------- Atributos ----------- //
    private static final double VALOR_HORA = 250;

    // ----------- Constructor ----------- //
    public ServicioArmado(double horas) {
        super(horas);
    }

    // ----------- Metodos ----------- //
    @Override
    public double getValorHora() {
        return VALOR_HORA;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
    }

    @Override
    public double calcularFacturacion() {
        return 1.12;
    }
}
