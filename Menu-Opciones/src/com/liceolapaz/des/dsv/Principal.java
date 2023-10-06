package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Escribir menú
        escribirMenu();
        // Pedir opción
        pedirOpcion();
        // Leer opción y guardar mensaje
        int opcion = leerOpcion();     // como solicitamos una opcion usamos un int (entero) e igualamos a una funcion nueva
        // Escribir mensaje dependiendo de la opcion
        escribirMensaje(opcion);
    }



    private static void escribirMenu() {
        System.out.println("MENU DE OPCIONES \n" + // el \n sirve para saltar de linea al principio de la siguiente
                "1. Opción 1 \n" +
                "2. Opción 2 \n" +
                "3. Opción 3 \n" +
                "0. Salir");
    }
    private static void pedirOpcion() {            // imprimimos la frase entre los ()
        System.out.print("Escoge una opción: ");
    }
    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in); // sirve para leer lo que escribe el usuario con el teclado
        return teclado.nextInt();
    }
    private static void escribirMensaje(int opcion) {
        switch (opcion){                        // entre parentesis se mete lo que queremos comprobar
            case 0:
                System.out.println("Hasta la proxima");
                System.exit(0);             // Para salir del programa se necesita crear un caso de exit que suele ser el 0
                break;
            case 1:
                System.out.println("Opción 1 escogida");
                break;
            case 2:
                System.out.println("Opción 2 escogida");
                break;
            case 3:
                System.out.println("Opción 3 escogida");
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
}
