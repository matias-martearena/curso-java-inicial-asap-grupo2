package com.github.grupo2.clase08.diagrama;

public class Auto extends Vehiculo{

    private int cantPuertas;

    public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
        super(patente, marca, cilindrada);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
}
