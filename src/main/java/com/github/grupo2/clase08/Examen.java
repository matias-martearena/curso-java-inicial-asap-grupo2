package com.github.grupo2.clase08;

/**
 * Clase abstracta que representa un examen genérico.
 * Implementa la interfaz Evaluable.
 */
public abstract class Examen implements Evaluable {

    // Atributos de la clase
    private String fecha;
    private Persona persona;

    /**
     * Constructor de la clase Examen.
     * @param fecha Fecha en que se realiza el examen
     * @param persona Persona que realiza el examen
     */
    public Examen(String fecha, Persona persona) {
        this.fecha = fecha;
        this.persona = persona;
    }

    // Getters y setters

    /**
     * Obtiene la fecha del examen.
     * @return Fecha del examen
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del examen.
     * @param fecha Nueva fecha del examen
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la persona que realiza el examen.
     * @return Persona que realiza el examen
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona que realiza el examen.
     * @param persona Nueva persona que realiza el examen
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
