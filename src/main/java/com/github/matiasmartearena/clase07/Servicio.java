package com.github.matiasmartearena.clase07;

public abstract class Servicio implements Facturable {
    private double horas;

    public Servicio(double horas) {
        this.horas = horas;
    }

    public double calcularPrecio() {
        return this.horas * getValorHora();
    }

    public abstract double getValorHora();
    public abstract double calcularFacturacion();

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}
