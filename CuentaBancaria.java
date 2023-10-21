/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author RODRIGO
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String descripcionCuenta;
    private String cuentaCCI;
    private double saldoDisponible = 0;
    private MovimientoCuenta[] movimientos;
    private String estado;

    public CuentaBancaria(String numeroCuenta, String descripcionCuenta, String cuentaCCI, double cliente, String estado1) {
        this.numeroCuenta = numeroCuenta;
        this.descripcionCuenta = descripcionCuenta;
        this.cuentaCCI = cuentaCCI;
        
        this.movimientos = new MovimientoCuenta[10]; 
        this.estado = "Activo"; 
    }

    public void calcularInteresMensual() {
       
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    public String getCuentaCCI() {
        return cuentaCCI;
    }

    public void setCuentaCCI(String cuentaCCI) {
        this.cuentaCCI = cuentaCCI;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldo) {
        this.saldoDisponible = saldo;
    }

    public MovimientoCuenta[] getMovimientos() {
        return movimientos;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", descripcionCuenta='" + descripcionCuenta + '\'' +
                ", cuentaCCI='" + cuentaCCI + '\'' +
                ", saldoDisponible=" + saldoDisponible +
                ", estado='" + estado + '\'' +
                '}';
    }
}

