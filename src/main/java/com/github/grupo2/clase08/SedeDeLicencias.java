package com.github.grupo2.clase08;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una sede donde se realizan exámenes de licencias de conducir.
 */
public class SedeDeLicencias {

    /** Lista que almacena todos los exámenes realizados en esta sede. */
    private List<Examen> examenes;

    /**
     * Constructor de la clase SedeDeLicencias.
     * Inicializa la lista de exámenes.
     */
    public SedeDeLicencias() {
        this.examenes = new ArrayList<>();
    }

    // ---------------- Metodos ------------------ //

    /**
     * Genera un informe con estadísticas de los exámenes realizados.
     *
     * @return Un objeto Informe con el porcentaje de examenes reprobados y el promedio de tiempo de los examenes de auto aprobados.
     */
    public Informe obtenerInforme() {
        return new Informe(this.porcentajeDeReprobados(), this.promTiempoAutosAprobados());
    }

    /**
     * Calcula el porcentaje de exámenes reprobados.
     *
     * @return El porcentaje de exámenes reprobados como un valor double.
     */
    private double porcentajeDeReprobados() {
        int totalExamenes = examenes.size();
        int totalReprobados = 0;
        for (Examen examen : examenes) {
            if (!examen.esAprobado()) {
                totalReprobados++;
            }
        }
        return (totalExamenes > 0) ? (totalReprobados * 100.0 / totalExamenes) : 0;
    }

    /**
     * Calcula el promedio de tiempo de los exámenes de auto aprobados.
     *
     * @return El promedio de tiempo de los exámenes de auto aprobados como un valor double.
     */
    private double promTiempoAutosAprobados() {
        double totalAprobadosAuto = 0;
        double sumaTiempoAprobadosAuto = 0;
        for (Examen examen : examenes) {
            if (examen.esAprobado() && examen instanceof ExamenDeAuto) {
                sumaTiempoAprobadosAuto += ((ExamenDeAuto) examen).getTiempoDeCircuito();
                totalAprobadosAuto++;
            }
        }
        return (totalAprobadosAuto > 0) ? (sumaTiempoAprobadosAuto / totalAprobadosAuto) : 0;
    }

    /**
     * Agrega un nuevo examen a la lista de exámenes de la sede.
     *
     * @param examen El examen a agregar.
     */
    public void agregarExamen(Examen examen) {
        this.examenes.add(examen);
    }
}