package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //CALCULADORA
        //1. Suma
        //2. Resta
        //3. Producto
        //4. División
        //0. Salir
        //Escoja una opción:

        do {
            // Escribir menú
            escribirMenu();
            // Leer opción escogida y guardarla
            int opcion = leerOpcion();
            // Si la opción es 0
            if (opcion == 0) {
                System.out.println("Gracias por usar la calculadora.");
                System.exit(0);
            } else if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                // Pedir primer operando
                pedirPrimerOperando();
                // Leer primer operando
                double primerOperando = leerOperando();
                // Pedir segundo operando
                pedirSegundoOperando();
                // Leer segundo operando
                double segundoOperando = leerOperando();
                // Escribir resultado
                escribirResultado(primerOperando, segundoOperando, opcion);
            } else {
                System.out.println("Opción no valida.");
            }
        } while (true);

    }

    private static void escribirResultado(double primerOperando, double segundoOperando, int opcion) {
        double resultado = 0;
        switch (opcion) {
            // Suma
            case 1:
                resultado = primerOperando + segundoOperando;
                break;

            // Resta
            case 2:
                resultado = primerOperando - segundoOperando;
                break;

            // Multiplicación
            case 3:
                resultado = primerOperando * segundoOperando;
                break;

            // División
            case 4:
                resultado = primerOperando / segundoOperando;
                break;
        }
        System.out.println("El resultado de la operación es: " + resultado);
    }

    private static void pedirSegundoOperando() {
        System.out.print("Escriba el primer operando: ");
    }

    private static double leerOperando() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();
    }

    private static void pedirPrimerOperando() {
        System.out.print("Escriba el primer operando: ");
    }


    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escribirMenu() {
        System.out.print("CALCULADORA \n" + // el \n sirve para saltar de linea al principio de la siguiente
                "1. Suma \n" +
                "2. Resta \n" +
                "3. Producto \n" +
                "4. División \n" +
                "0. Salir \n" +
                "Escoja una opción: ");
    }
}
