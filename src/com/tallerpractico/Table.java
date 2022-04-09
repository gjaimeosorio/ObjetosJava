package com.tallerpractico;

/**
 * 
 * @author Gabriel Jaime Osorio Hernández
 */

/**
 * Creación de la clase Table.
 */
public class Table {
    /**
     * Representa el material de la mesa.
     */
    private String material;
    /**
     * Representa el precio de la mesa.
     */
    protected int price;
    /**
     * Representa el nombre del dueño de la mesa.
     */
    public String ownerName;

    /**
     * Crea una instancia de la clase Table.
     */
    public Table() {
    }

    /**
     * Encapsulamiento en la clase Table
     * Modificar el valor del atributo material.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Acceder al valor del atributo material.
     */
    public String getMaterial() {
        return material;
    }

}
