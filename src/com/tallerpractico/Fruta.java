package com.tallerpractico;

import java.util.ArrayList;

/**
 * 
 * @author Gabriel Jaime Osorio Hernández
 */

 /**
 * Creación de la clase Fruta.
 */
public class Fruta {
    /**
     * Representa el nombre de la fruta.
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta.
     */
    private float averageWeight;
    /**
     * Representa los posibles colores que puede tener la fruta.
     */
    public ArrayList<String> colors;
    /**
     * Representa el precio de la fruta en el mercado.
     */
    public int precio;

    /**
     * Crea una instancia de la clase CuentaBancaria.
     */
    public Fruta() {
    }

    /**
     * No son necesarios los métodos setColors y getColors, ya que colors 
     * es un atributo público.
     */

     /**
     * Encapsulamiento en la clase Fruta.
     * Modificar el valor del atributo averageWeight.
     */
    public void setAverageWeight(Float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Accede al valor del atributo averageWeight.
     */
    public float getAverageWeight() {
        return averageWeight;
    }

}
