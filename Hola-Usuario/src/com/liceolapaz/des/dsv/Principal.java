package com.liceolapaz.des.dsv;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Encabezado
        crearEncabezado();
        // Pedir nombre al usuario
        pedirNombre();
        // Leer nombre y recoger ese nombre en variable
        String nombreUsuario = leerNombre();
        // Saludar al usuario
        saludarUsuario(nombreUsuario);

    }




    // VOID se usa para variables que no devuelven nada
    private static void crearEncabezado() {
        // para imprimir por pantalla usamos SOUT y le damos a enter y autocompleta
        System.out.println("Hola Usuario");
    }
    private static void pedirNombre() {
        //
        System.out.print("Escribe tu nombre: ");
    }
    private static String leerNombre() {
        // Crear variable para leer lo que escribimos del teclado. Se iguala a una nueva variable de Scanner
        // que está dentro de System (por eso el .in )
        Scanner teclado = new Scanner(System.in);

        return teclado.nextLine();
    }

    private static void saludarUsuario(String userName) {
        System.out.println("Muy buenas " + userName);
    }

}
