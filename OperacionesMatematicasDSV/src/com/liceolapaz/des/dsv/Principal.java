package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Escribir menu
        escribirMenu();
        // Leer opción
        int opcion = leerOpcion();
       switch (opcion) {
           case 1:
               // Pedir Base
               pedirBase();
               // Leer y guardar base
               double base = leerDouble();
               // Pedir exponente
               pedirExponente();
               // Leer exponente
               double exponente = leerDouble();
               // Calcular resultado
               double resultadoPotencia = Math.pow(base,exponente);
               // Mostrar resultado
               mostrarResultado(resultadoPotencia);

       }
    }

    private static void mostrarResultado(double resultadoPotencia) {
        System.out.println("El resultado de la operación es: " + resultadoPotencia);
    }


    private static void pedirExponente() {
        System.out.print("Escriba el valor del exponente: ");
    }

    private static double leerDouble() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();
    }


    private static void pedirBase() {
        System.out.print("Escriba el valor de la base: ");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escribirMenu() {
        System.out.print("POTENCIAS Y RAICES CUADRADAS\n" +
                "1. Potencia\n" +
                "2. Raíz cuadrada\n" +
                "3. Salir\n" +
                "Escoja una opción: ");
    }
}
