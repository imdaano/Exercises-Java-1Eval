package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // FIGURAS GEOMÉTRICAS
        //1. Triángulo
        //2. Rectángulo
        //3. Cuadrado
        //4. Pentágono
        //0. Salir
        //Escoja una opción:


        // Escribir menú
        escribirMenu();
        // Leer opción y guardarla
        int opcion = leerOpcion();
        // creamos el switch
        switch (opcion) {
            // Si la opción es 0
            case 0:
                // Salir
                System.out.println("Gracias por usar la aplicación.");
                System.exit(0);
                break;
            // Si la opción es 1 (Triángulo)
            case 1:
                pedirBaseTriangulo();
                // Leer base y almacenarla
                double baseTriangulo = leerDouble();
                // Pedir segundo lado
                pedirSegundoLado();
                // Guardar segundo lado
                double segundoLado = leerDouble();
                // Pedir 3º lado
                pedirTercerLado();
                // Leer tercer lado
                double tercerLado = leerDouble();
                // Pedir altura
                pedirAlturaTriangulo();
                // Leer altura y almacenarla
                double alturaTriangulo = leerDouble();
                // Calcular área
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                // Calcular perímetro
                double perimetroTriangulo = baseTriangulo + segundoLado + tercerLado;
                // Escribir resultado
                escribirResultado(areaTriangulo, baseTriangulo);
        }


    }

    private static void escribirResultado(double areaTriangulo, double baseTriangulo) {
        System.out.println("El área del triángulo es "+ areaTriangulo + ". Y el perímetro del triángulo es: " + baseTriangulo + ".");
    }


    private static void pedirTercerLado() {
        System.out.print("Introduzca el tercer lado del triángulo: ");
    }

    private static void pedirSegundoLado() {
        System.out.print("Introduzca el segundo lado del triangulo: ");
    }

    private static void pedirAlturaTriangulo() {
        System.out.print("Introduzca la altura del triángulo: ");
    }

    private static double leerDouble() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }

    private static void pedirBaseTriangulo() {
        System.out.print("Escriba la base del triángulo: ");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escribirMenu() {
        System.out.print(" FIGURAS GEOMÉTRICAS\n" +
                "1. Triángulo\n" +
                "2. Rectángulo\n" +
                "3. Cuadrado\n" +
                "4. Pentágono\n" +
                "0. Salir\n" +
                "Escoja una opción: ");
    }
}
