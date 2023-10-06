package com.liceolapaz.des.dsv;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir numero a buscar al usuario
        pedirNumeroBuscar();
        // Leer el numero a buscar y almacenarlo
        int numeroBuscar = leerEntero();
        // Pedimos al usuario el numero maximo de intentos
        pedirMaximoIntentos();
        // Leemos el numero maximo de intentos y lo almacenamos
        int maximoIntentos = leerEntero();
        // Generar numeros aleatorios
        int numeroIntentos = 0;
        while (numeroIntentos < maximoIntentos) {
            // Generar numero aleatorio y guardarlo
            int numeroAleatorio = generarNumeroAleatorio(1,10);
            // Escribir el numero aleatorio generado
            System.out.println("El numero aleatorio generado es " + numeroAleatorio );
            // Sumar un intento en el contador de intentos
            numeroIntentos++;
            // Comprobar si encontramos el numero a buscar
            if (numeroAleatorio == numeroBuscar) {
                System.out.println("Numero encontrado en " + numeroIntentos + " intentos.");
                break;
            } else if (numeroIntentos == maximoIntentos){
                System.out.println("Número no encontrado en " + numeroIntentos + " intentos.");
            }
        }
    }


    // Metodo para generar numero aleatorio
    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();

        return random.nextInt(max - min + 1) + min;
    }

    private static void pedirNumeroBuscar() {
        System.out.print("Escriba un número del 1 al 10: ");
    }

    private static int leerEntero() {
        Scanner  teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    private static void pedirMaximoIntentos() {
        System.out.print("Introduce el número máximo de intentos: ");
    }
}
