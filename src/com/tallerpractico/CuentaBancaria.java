package com.tallerpractico;

/**
 * 
 * @author Gabriel Jaime Osorio Hernández
 */

 /**
 * Creación de la clase CuentaBancaria.
 */
public class CuentaBancaria {
    /**
     * Representa el número de la cuenta bancaria.
     */
    private int accountNumber;
    /**
     * Representa es estado de la cuenta bancaria.
     */
    protected boolean activated;
    /**
     * Representa el código de seguridad de la cuenta bancaria.
     */
    private int securityCode;
    /**
     * Representa el nombre del propietario de la cuenta bancaria.
     */
    private String userName;

    /**
     * Crea una instancia de la clase CuentaBancaria.
     */
    public CuentaBancaria() {
    }

    /**
     * Encapsulamiento en la clase CuentaBancaria
     * Modificar el valor del atributo activated.
     */
    public void setActived(boolean activated) {
        this.activated = activated;
    }

    /**
     * Acceder al valor del atributo activated.
     */
    public boolean getActived() {
        return activated;
    }

    /**
     * Modificar el valor del atributo accountNumber.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Acceder al valor del atributo accountNumber.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Modificar el valor del atributo securityCode.
     */
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * Acceder al valor del atributo securityCode.
     */
    public  int getSecurityCode() {
        return securityCode;
    }

    /**
     * Modificar el valor del atributo userName.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Acceder al valor del atributo securityCode.
     */
    public String getUserName() {
        return userName;
    }
}