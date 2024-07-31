package com.github.grupo2.clase08;

public class Moto extends Vehiculo {

    private boolean tieneEspejos;

    public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
        super(patente, marca, cilindrada);
        this.tieneEspejos = tieneEspejos;
    }

    public boolean isTieneEspejos() {
        return tieneEspejos;
    }

    public void setTieneEspejos(boolean tieneEspejos) {
        this.tieneEspejos = tieneEspejos;
    }
}
