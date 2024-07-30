package com.github.grupo2.clase07;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    List<Insumo> insumos = new ArrayList<>();
    List<Servicio> servicios = new ArrayList<>();

    Servicio servicioArmado1 = new ServicioArmado(8);
    Servicio servicioArmado2 = new ServicioArmado(10);

    Servicio servicioReparacion1 = new ServicioReparacion(1, 8);
    Servicio servicioReparacion2 = new ServicioReparacion(2, 9);
    Servicio servicioReparacion3 = new ServicioReparacion(1, 11);
    Servicio servicioReparacion4 = new ServicioReparacion(4, 10);

    Insumo insumo1 = new Insumo("Caja", 20, 300, TipoDeInsumo.PERIFERICO);
    Insumo insumo2 = new Insumo("PEPE", 3, 150, TipoDeInsumo.HARDWARE);
    Insumo insumo3 = new Insumo("PepaPig", 27, 3000, TipoDeInsumo.LIMPIEZA);

    public void agregarDatos() {

        servicios.add(servicioArmado1);
        servicios.add(servicioArmado2);

        servicios.add(servicioReparacion1);
        servicios.add(servicioReparacion2);
        servicios.add(servicioReparacion3);
        servicios.add(servicioReparacion4);

        insumos.add(insumo1);
        insumos.add(insumo2);
        insumos.add(insumo3);
    }

    public Integer cantServiciosSimples() {

        int serviciosSimples = 0;

        for (Servicio servicio : servicios) {
            if (servicio instanceof ServicioReparacion && ((ServicioReparacion) servicio).esServicioSimple()) {
                serviciosSimples++;
            }
        }

        return serviciosSimples;
    }

    public double montoTotalFacturado() {
        double totalFacturacion = 0;

        for ( Servicio servicio : servicios ) {
            totalFacturacion += servicio.calcularFacturacion();
        }

        for ( Insumo insumo : insumos ) {
            totalFacturacion += insumo.calcularFacturacion();
        }

        return totalFacturacion;
    }
}
