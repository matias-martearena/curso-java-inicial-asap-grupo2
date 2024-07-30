package com.github.grupo2.clase07;

public class Main {
    public static void main(String[] args) {

        Historial historial = new Historial();

        historial.agregarDatos();

        System.out.println("Servicios simples: " + historial.cantServiciosSimples());
        System.out.println("Cantidad de facturacion: " + String.format("%.2f", historial.montoTotalFacturado()));
    }
}
