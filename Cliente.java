/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;



/**
 *
 * @author RODRIGO
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int dni;
    private CuentaBancaria[] cuentas;

    public Cliente(String idCliente, String nombre, String apellido, String direccion, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", direccion=" + direccion +
                ", dni=" + dni +
                "]";
    }

    void mostrarInformacion() {
    }

void agregarEventoBancario(String evento) {
    
}

void agregarCuenta(CuentaBancaria cuentaBancaria) {
    
}

}

    