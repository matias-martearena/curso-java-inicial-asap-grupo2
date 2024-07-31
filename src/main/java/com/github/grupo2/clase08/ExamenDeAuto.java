package com.github.grupo2.clase08;

public class ExamenDeAuto extends Examen {

    private static final int TIEMPO_MAXIMO_PERMITIDO = 90; //
    private Circuito circuito;
    private Auto auto;

    public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
        super(fecha, persona);
        this.circuito = circuito;
        this.auto = auto;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	// ---------------- Metodos ------------------ //

    public int getTiempoDeCircuito() {
        return this.circuito.getTiempoEnSeg();
    }
    
    @Override
    public boolean esAprobado() {
    	return (this.circuito.esAprobado() && this.getTiempoDeCircuito() <= TIEMPO_MAXIMO_PERMITIDO);
    }

}
