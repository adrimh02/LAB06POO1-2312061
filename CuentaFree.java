/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author RODRIGO
 */
public class CuentaFree {
    
    private final boolean numIlimitadoRetiro;

    public CuentaFree(boolean numIlimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        return "CuentaFree{" +
                "numIlimitadoRetiro=" + numIlimitadoRetiro +
                '}';
    }
} 
