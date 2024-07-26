package com.github.matiasmartearena.clase07;

import com.github.sanchezih.util.math.Matematica;

public class Insumo implements Facturable {
    private String nombre;
    private double porcentaje;
    private double precioLista;
    private TipoDeInsumo tipo;

    public Insumo (String nombre, double porcentaje, double precioLista, TipoDeInsumo tipo) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.precioLista = precioLista;
        this.tipo = tipo;
    }

    @Override
    public double calcularFacturacion() {
        return Matematica.sumarPorcentaje(this.precioLista, this.porcentaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public TipoDeInsumo getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeInsumo tipo) {
        this.tipo = tipo;
    }

}
