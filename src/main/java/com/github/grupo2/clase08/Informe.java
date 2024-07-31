package com.github.grupo2.clase08;

public class Informe {

    private double porcReprobados;
    private double promTiempoAutosAprobados;

    public Informe (double porcReprobados, double promTiempoAutosAprobados) {
        this.porcReprobados = porcReprobados;
        this.promTiempoAutosAprobados = promTiempoAutosAprobados;
    }

    public double getPorcReprobados() {
        return porcReprobados;
    }

    public void setPorcReprobados(double porcReprobados) {
        this.porcReprobados = porcReprobados;
    }

    public double getPromTiempoAutosAprobados() {
        return promTiempoAutosAprobados;
    }

    public void setPromTiempoAutosAprobados(double promTiempoAutosAprobados) {
        this.promTiempoAutosAprobados = promTiempoAutosAprobados;
    }
}
