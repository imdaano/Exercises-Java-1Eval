package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true) {
            escribirMenu();
            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();


            switch (opcion) {
                case 0:
                    System.exit(0);
                case 1:
                    calcularLetra();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void calcularLetra() {
        System.out.println("Escriba los números de su DNI:");
        Scanner teclado = new Scanner(System.in);
        int numeroDNI = teclado.nextInt();

        int modulo;
        modulo =  numeroDNI % 23;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "Z", "S", "Q", "V", "H", "L","C","K", "E"};
        String letra = letras[modulo];
        System.out.println("La letra de tu DNI es: " + letra);
    }



    private static void escribirMenu() {
        System.out.println("""
                Escoja su opción:
                
                1. Calcular la letra de su DNI
                0. Salir
                """);
    }
}
