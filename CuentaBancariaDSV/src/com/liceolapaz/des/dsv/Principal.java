package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    private static final int SIN_CUENTA = 0;
    private static final int CUENTA_NORMAL = 1;
    private static final int CUENTA_PREMIUM = 2;

    private static int tipoCuenta = SIN_CUENTA;
    private static double saldoCuenta = 0;
    public static void main(String[] args) {
        // BANCO
        // 1. Crear cuenta
        // 2. Ingresar dinero
        // 3. Retirar dinero
        // 4. Consultar saldo
        // 0. Salir
        // Escoja una opción:

        // Escribir menu:
        menuOpciones();
        // Pedir opción, leerla, almacenarla
        int opcion = leerOpcion();

        switch (opcion){
            case 0:
                System.out.println("Hasta la próxima.");
                System.exit(0);
            case 1:
                //Enseñar submenu
                submenuCuenta();
                //Pedir opción
                int opcion2 = leerOpcion();
                if (opcion2 == 1) {
                    crearCuenta(CUENTA_NORMAL);
                } else if (opcion2 == 2) {
                    crearCuenta(CUENTA_PREMIUM);
                } else if (opcion2 == 0) {
                    // Volver al menú principal
                } else {
                    // Mostrar mensaje de error
                    System.out.println("Opción no válida");
                }
                break;
            case 2:
                ingresarDinero();
                break;
            case 3:
// completar caso 3
        }





    }

    private static void ingresarDinero() {
        // Pedir cantidad
        pedirCantidad();
        // Leer cantidad y almacenarla
        double cantidad = leerDouble();
        // Si la cantidad es positiva
        if (cantidad > 0) {
            // Sumar cantidad al saldo
            saldoCuenta += cantidad;
            // Mostrar saldo
            mostrarSaldo();

            // Si no lo es
        } else {
            // Mostrar error
            System.out.println("La cantidad a ingresar debe ser positiva");
        }


    }

    private static void mostrarSaldo() {
        // Si hay cuenta activa
        if (tipoCuenta != SIN_CUENTA){
            // Escribir saldo
            System.out.println("El saldo de la cuenta es \" + String.format(\"%.2f\", saldoCuenta) + \" €\"");

        // Si no hay
        } else {

        }

            // Mostrar error
        System.out.println("No hay cuenta activa");

    }


    private static void pedirCantidad() {
        System.out.println("Introduce la cantidad: ");
    }

    private static void crearCuenta(int tipo) {
        //Pedir saldo inicial
        pedirSaldoInicial();
        //Leer saldo y almacenarlo
        saldoCuenta = leerDouble();
        // Si el el saldo es negativo
        if (saldoCuenta < 0) {
            // Mostrar error
            System.out.println("El saldo inicial no puede ser negativo.");
            // Resetear el saldo
            saldoCuenta = 0;
            // Resetear tipo de cuenta
            tipoCuenta = SIN_CUENTA;
            // Salir del método
            return;
        }
        tipoCuenta = tipo;

    }

    private static double leerDouble() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();
    }

    private static void pedirSaldoInicial() {
        System.out.print("Escriba su saldo inicial: ");
    }


    private static void submenuCuenta() {
        System.out.print("Tipo de cuenta\n" +
                " 1. Cuenta normal\n" +
                " 2. Cuenta Premium\n" +
                " 0. Cancelar\n" +
                "Escoja una opción: ");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menuOpciones() {
        System.out.print("BANCO\n" +
                " 1. Crear cuenta\n" +
                " 2. Ingresar dinero\n" +
                " 3. Retirar dinero\n" +
                " 4. Consultar saldo\n" +
                " 0. Salir\n" +
                "Escoja una opción: ");
    }
}
