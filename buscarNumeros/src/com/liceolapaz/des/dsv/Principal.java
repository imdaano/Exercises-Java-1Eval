package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Introduzca 10 numeros enteros: ");
        Scanner teclado = new Scanner(System.in);
        int numerosElegidos[] = new int[10];

        for (int i = 0; i < numerosElegidos.length; i++) {
            numerosElegidos[i] = teclado.nextInt();
        };

        System.out.print ("Escribe un numero a buscar: ");

        int numeroBuscado = teclado.nextInt();

        int vecesEncontrado = 0;

        for (int i = 0; i < numerosElegidos.length ; i++) {
            if ( numerosElegidos[i] == numeroBuscado ) {
                vecesEncontrado++;
                System.out.println("Numero encontrado " +vecesEncontrado + " veces.");
            }
        }

        if (vecesEncontrado == 0) {
            System.out.println("El numero "+ numeroBuscado + " no se encontró ninguna vez");
        } else {
            System.out.println("El numero " + numeroBuscado + " se encontró " + vecesEncontrado + " veces.");
        }

    }
}
