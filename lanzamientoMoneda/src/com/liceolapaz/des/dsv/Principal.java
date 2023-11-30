package com.liceolapaz.des.dsv;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true){
                // Escribir menú
                menuPrincipal();
                // Leer opción
                Scanner teclado = new Scanner(System.in);
                Random random = new Random();
                int option = teclado.nextInt();

                // Caso 1 lanzar moneda
                switch (option) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        int numero = random.nextInt(2) + 1;
                        if (numero == 1) {
                            System.out.println("Ha salido: Cara");
                        } else if (numero == 2) {
                            System.out.println("Ha salido: Cruz");
                        }
                        break;


                    default:
                        System.out.println("Opción no válida.");
                }
        }
    };

    private static void menuPrincipal() {
        System.out.println("Escoja una opción: \n" +
                "\n" +
                "1. Lanzar moneda. \n" +
                "0. Salir");
    }
}
