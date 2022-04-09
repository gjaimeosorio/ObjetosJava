package com.tallerpractico;

/**
 * 
 * @author Gabriel Jaime Osorio Hernández
 */

/**
 * Creación de la clase Table.
 */
public class Raqueta {
    /**
     * Representa la marca de la raqueta.
     */
    private String brand;
    /**
     * Representa el tipo de cuerda de la raqueta.
     */
    protected String ropeType;
    /**
     * Representa el nombre del dueño de la raqueta.
     */
    public String ownerName;

    /**
     * Crea una instancia de la clase Raqueta.
     */
    public Raqueta() {
    }

    /**
     * Encapsulamiento en la clase Table
     * Modificar el valor del atributo material.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Acceder al valor del atributo material.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Modificar el valor del atributo ropeType.
     */
    public void setRopeType(String ropeType) {
        this.ropeType = ropeType;
    }

    /**
     * Acceder al valor del atributo ropeType.
     */
    public String getRopeType() {
        return ropeType;
    }

}
