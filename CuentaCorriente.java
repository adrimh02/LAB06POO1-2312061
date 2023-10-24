/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author RODRIGO
 */
public class CuentaCorriente {
    
    private final double tasaInteresAnual = 0.02; 
    private final double COMISION_FIJA = 2.0;
    private final int maxRetiro;
    private int retirosEnCajeroRealizados = 0; 

    public CuentaCorriente(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

   
    public boolean retirarEnCajero(double monto) {
        if (retirosEnCajeroRealizados < maxRetiro) {
            // Realiza el retiro en cajero
            retirosEnCajeroRealizados++;
            
            return true;
        }
        return false; 
    }

   

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "tasaInteresAnual=" + tasaInteresAnual +
                ", COMISION_FIJA=" + COMISION_FIJA +
                ", maxRetiro=" + maxRetiro +
                '}';
    }
}



