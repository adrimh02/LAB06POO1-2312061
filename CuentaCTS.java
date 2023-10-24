/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author RODRIGO
 */
public class CuentaCTS {
    
    private final double tasaInteresAnual = 0.07; // 7%
    private final double puntos;

    public CuentaCTS(double puntos) {
        this.puntos = puntos;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        return "CuentaCTS{" +
                "tasaInteresAnual=" + tasaInteresAnual +
                ", puntos=" + puntos +
                '}';
    }
}  
