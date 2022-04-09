package com.tallerpractico;

/**
 * 
 * @author Gabriel Jaime Osorio Hernández
 */

import java.util.Date;

/**
 * Creación de la clase Persona.
 */
public class Persona {
    /**
     * Representa el nombre de la persona.
     */
    public String name;
    /**
     * Representa el primer apellido de la persona.
     */
    public String lastName;
    /**
     * Representa el segundo apellido de la persona.
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public Date dateBirth;
    /**
     * Representa el peso de la persona.
     */
    public float heigh;
    /**
     * Representa el número de identificación de la persona.
     */
    public int id;

    /**
     * Crea una instancia de la clase Persona.
     */
    public Persona() {
    }

    /**
     * No son necesarios los métodos setName y getName, ya que name
     * es un atributo público.
     */
}