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
public class EventoBancario {

    static void add(String evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    private final Date fecha;
    private final String tituloEvento;
    private final String descripcionEvento;

    public EventoBancario(Date fecha, String tituloEvento, String descripcionEvento) {
        this.fecha = fecha;
        this.tituloEvento = tituloEvento;
        this.descripcionEvento = descripcionEvento;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        return "EventoBancario{" +
                "fecha=" + fecha +
                ", tituloEvento='" + tituloEvento + '\'' +
                ", descripcionEvento='" + descripcionEvento + '\'' +
                '}';
    }
   }
