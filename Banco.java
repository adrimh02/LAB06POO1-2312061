/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;


 import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RODRIGO
 */

public class Banco {

    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private List<CuentaBancaria> cuentas = new ArrayList<>();
    private List<String> eventosBancarios = new ArrayList<>();

    public Banco(String nombre, String apellido, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void agregarEventoBancario(String evento) {
        eventosBancarios.add(evento);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Cuentas Bancarias:");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta());
            System.out.printf("Saldo Disponible: S/ %.2f%n", cuenta.getSaldoDisponible());
        }
        System.out.println("Eventos Bancarios:");
        for (String evento : eventosBancarios) {
            System.out.println(evento);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de clientes (N): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        List<Cliente> clientes = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la información del Cliente " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("DNI: ");
            String dni = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

                 Cliente cliente = new Cliente(nombre, apellido, dni, direccion, telefono);

            System.out.print("Número de cuentas bancarias: ");
            int numCuentas = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            for (int j = 1; j <= numCuentas; j++) {
                System.out.println("Cuenta Bancaria " + j + ":");
                System.out.print("Número de Cuenta: ");
                String numeroCuenta = scanner.nextLine();
                System.out.print("Descripción de Cuenta: ");
                String descripcionCuenta = scanner.nextLine();
                System.out.print("Cuenta CCI: ");
                String cuentaCCI = scanner.nextLine();
                System.out.print("Saldo Disponible: S/ ");
                double saldoDisponible = scanner.nextDouble();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.print("Estado (Restringido, Bloqueado, Activo, etc.): ");
                String estado = scanner.nextLine();

                CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, descripcionCuenta, cuentaCCI, saldoDisponible, estado);
                cliente.agregarCuenta(cuentaBancaria);
            }

            System.out.print("Número de eventos bancarios: ");
            int numEventos = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            for (int k = 1; k <= numEventos; k++) {
                System.out.print("Evento Bancario " + k + ": ");
                String evento = scanner.nextLine();
                cliente.agregarEventoBancario(evento);
            }

            clientes.add(cliente);
        }

        System.out.println("\nLista de Clientes:");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println("Cliente " + (i + 1) + ":");
            cliente.mostrarInformacion();
        }
    }
}

