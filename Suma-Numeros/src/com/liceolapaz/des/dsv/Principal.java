package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir numeros al usuario
        pedirNumero();
        // Leer números y guardarlos
        int[] numeros = new int[10];  //en el new int entre corchetes ponemos el numero de objetos que vamos a guardar en el array
        int contador = 0;
        do {
            // Leer numero y guardarlo
            numeros[contador] = leerNumero();
            // Sumar uno al contador
            contador++;
        } while ( contador < 10);
        // Sumar numeros y guardar resultado
        int resultado = sumarNumeros(numeros);
        // escribir resultado
        escribirResultado(resultado);
    }

    private static void escribirResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    private static int sumarNumeros(int[] numeros) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i];
        }
        return  resultado;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }


    private static void pedirNumero() {
        System.out.println("Escribe 10 números enteros:");
    }
}
