package com.liceolapaz.des.dsv;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // ADIVINA EL NÚMERO
        //1. Del 1 al 10 (3 intentos)
        //2. Del 1 al 50 (5 intentos)
        //0. Salir
        //Escoja una opción:

       do {
        // Escribir menu
        escribirMenu();
        // Pedir opción
        pedirOpcion();
        // Leer la opción escogida
        int opcion = leerNumero();
        // desenvolver las opciones

        int min;
        int max;
        int maxIntentos;
        switch (opcion){

            case 0:
                System.out.println("Hasta la proxima");
                System.exit(0);             // Para salir del programa se necesita crear un caso de exit que suele ser el 0
                break;
            case 1:
                min = 1;
                max = 10;
                maxIntentos = 3;
                // System.out.println("Opción 1 escogida");
                play(min,max,maxIntentos);
                break;
            case 2:
                min = 1;
                max = 50;
                maxIntentos = 5;
                play(min,max,maxIntentos);
                break;
            default:
                // Mostrar mensaje de error
                System.out.println("Opción no válida");
        }
        //
        } while (true);
    }


    private static void play(int min, int max, int maxIntentos){
        // Generar un número y almacenarlo
        int numeroGenerado = generarNumeroAleatorio(min, max);
        // System.out.println(numeroGenerado);
        // Variable para número de intentos actuales
        int intentos = 0;
        int numeroUsuario = 0;
        while (intentos < maxIntentos){
            // Pedir numero al usuario
            pedirNumero();
            // Leer número y almacenarlo
            numeroUsuario = leerNumero();
            // Incrementar el numero de intentos
            intentos++;
            // Comprobar numeros
            comprobarNumeros(numeroUsuario, numeroGenerado, intentos, maxIntentos);
            // Si acierta el número, salir del bucle
            if (numeroGenerado == numeroUsuario) {
                break;
            }
            // Si agotamos intentos, escribir número a adivinar
            if (intentos >= maxIntentos && numeroGenerado != numeroUsuario ) {
                System.out.println("El número a adivinar era " + numeroGenerado);
            }
        }
    }

    private static void comprobarNumeros(int numeroUsuario, int numeroGenerado, int intentos, int maxIntentos) {
        if (numeroUsuario == numeroGenerado) {
            System.out.println("Numero encontrado en " + intentos + " intentos.");
        } else if (numeroGenerado < numeroUsuario) {
            if (intentos < maxIntentos) {
                System.out.println("El número a adivinar es menor");
            }

        } else {
            if (intentos < maxIntentos) {
                System.out.println("El número a adivinar es mayor");
            }
        }
    }

    private static void pedirNumero() {
        System.out.println("Escriba un número: ");
    }

    ;

    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();

        return random.nextInt(max - min + 1) + min;
    }



    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoge una opción: ");
    }


    private static void escribirMenu() {
        System.out.println("ADIVINA EL NÚMERO \n" + // el \n sirve para saltar de linea al principio de la siguiente
                "1. Del 1 al 10 (3 intentos) \n" +
                "2. Del 1 al 50 (5 intentos) \n" +
                "0. Salir\n" +
                "\n");
    }
}
