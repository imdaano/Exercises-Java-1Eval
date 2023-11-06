package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir los números
        pedirNumeros();
        // Variable para almacenar números
        int[] numeros = new int[10];
        // Variable para contar números almacenados
        int numerosAlmacenados = 0; // se crea variable inicializada en 0 para ir almacenando los numeros
        while (true) {
            // Leer el número y almacenarlo
            int numero = leerNumero();
            // Si es positivo
            if (numero > 0){
            // Almacenarlo
                numeros[numerosAlmacenados] = numero; // en el array numeros almacenamos los numeros que el usuario escriba
                numerosAlmacenados++; //  se suma la cantidad de numeros que vaya escribiendo
            // Si no es positivo
            } else {
                // Mostrar un mensaje de error
                System.out.println("Por favor, introduzca solo números enteros positivos");
                continue;
            }
            if (numerosAlmacenados == 10) {
                break;
            }

        }
        // Escribir números
        escribirNumeros(numeros);
        // Escribir mensaje de despedida

    }

    private static void escribirNumeros(int[] numeros) {
        System.out.print("Los números introducidos fueron:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();
    }


    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeros() {
        System.out.println("Escriba 10 numeros enteros: ");
    }
}
