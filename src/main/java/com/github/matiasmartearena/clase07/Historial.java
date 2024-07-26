package com.github.matiasmartearena.clase07;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    public static void main(String[] args) {
        // ------------- Atributos ------------- //
        List<Insumo> insumos = new ArrayList<>();
        List<Servicio> servicios = new ArrayList<>();

        Servicio servicioArmado1 = new ServicioArmado(8);
        Servicio servicioArmado2 = new ServicioArmado(10);

        Servicio servicioReparacion1 = new ServicioReparacion(1, 8);
        Servicio servicioReparacion2 = new ServicioReparacion(4, 10);

        Insumo insumo1 = new Insumo("Caja", 20, 300, TipoDeInsumo.PERIFERICO);
        Insumo insumo2 = new Insumo("PEPE", 3, 150, TipoDeInsumo.HARDWARE);
        Insumo insumo3 = new Insumo("PepaPig", 27, 3000, TipoDeInsumo.LIMPIEZA);

        servicios.add(servicioArmado1);
        servicios.add(servicioArmado2);

        servicios.add(servicioReparacion1);
        servicios.add(servicioReparacion2);

        insumos.add(insumo1);
        insumos.add(insumo2);
        insumos.add(insumo3);

//        public double montoTotalFacturado() {
//            return 1.12;
//        }

//        public void cantServiciosSimples() {
//            int cantidadServicios = 0;
//            for (Servicio servicio : servicios) {
//                if (servicio isInstanceOf ServicioArmado) {
//                    cantidadServicios++;
//                }
//            }
//            System.out.println("La cantidad de servicios simples es: " + cantidadServicios);
//        }
    }
}
