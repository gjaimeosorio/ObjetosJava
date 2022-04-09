package com.tallerpractico;

import java.util.ArrayList;

/**
 * 
 * @author Gabriel Jaime Osorio Hernández
 */

/**
 * Creación de la clase Bicicleta.
 */
public class Bicicleta {
    /**
     * Representa el precio de la bicicleta.
     */
    private int price;
    /**
     * Representa el tipo de bicicleta.
     */
    private String type;
    /**
     * Representa los colores que tiene la bicicleta.
     */
    protected ArrayList<String> colors;
    /**
     * Representa el nombre del dueño de la bicicleta.
     */
    public String ownerName;

    /**
     * Crea una instancia de la clase Bicicleta.
     */
    public Bicicleta() {
    }

    /**
     * Encapsulamiento en la clase Bicicleta
     * Modificar el valor del atributo type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Acceder al valor del atributo type.
     */
    public String getType() {
        return type;
    }

    /**
     * Modificar el valor del atributo price.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Acceder al valor del atributo price.
     */
    public int getPrice() {
        return price;
    }


}
