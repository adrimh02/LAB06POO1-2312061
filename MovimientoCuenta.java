/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.Date;

/**
 *
 * @author RODRIGO
 */
public class MovimientoCuenta {

    private String numOperacion;
    private String descripcion;
    private Date fecha;
    private double importe;
    private String tipoOperacion;

  
    public MovimientoCuenta(String numOperacion, String descripcion, Date fecha, double importe, String tipoOperacion) {
        this.numOperacion = numOperacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.importe = importe;
        this.tipoOperacion = tipoOperacion;
    }

    // Métodos Getter y Setter
    public String getNumOperacion() {
        return numOperacion;
    }

    public void setNumOperacion(String numOperacion) {
        this.numOperacion = numOperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    
    @Override
    public String toString() {
        return "MovimientoCuenta{" +
                "numOperacion='" + numOperacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", importe=" + importe +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                '}';
    }
}



