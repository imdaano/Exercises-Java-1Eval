package com.liceolapaz.des.dsv;

import java.util.ArrayList;
import java.util.Random;
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
                    break;
                case 1:
                    lanzarDado();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private static void lanzarDado() {
        Random random = new Random();
        int resultado = random.nextInt(6) + 1;
        System.out.println("Ha caído el: " + resultado);
    }

    private static void escribirMenu() {
        System.out.println("""
                Elija su opción:
                
                1.Jugar
                0.Salir
                """);
    }
}
