package com.github.grupo2.clase08;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class SedeDeLicencias {

    private List<Examen> examenes = new ArrayList<>();
    
    public SedeDeLicencias() {
    	this.examenes = new ArrayList<>();
    }
    
    // ---------------- Metodos ------------------ //

    public String obtenerInforme() {
        Informe informe = new Informe(this.porcentajeDeReprobados(), this.promTiempoAutosAprobados());
        String json = new Gson().toJson(informe);
        return json;
    }

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

    private double promTiempoAutosAprobados() {
        double totalAprobadosAuto = 0;
        double sumaTiempoAprobadosAuto = 0;
        for (Examen examen : examenes) {
			if (examen.esAprobado() && examen instanceof ExamenDeAuto) {
                sumaTiempoAprobadosAuto += ((ExamenDeAuto) examen).getTiempoDeCircuito();
                totalAprobadosAuto++;
            }
        }
        return (totalAprobadosAuto  > 0) ? (sumaTiempoAprobadosAuto / totalAprobadosAuto) : 0;
    }

	public void agregarExamen(Examen examen) {
		this.examenes.add(examen);	
	}
}