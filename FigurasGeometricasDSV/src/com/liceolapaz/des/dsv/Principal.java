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

do {

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
            escribirResultado(areaTriangulo, perimetroTriangulo);

            break;
        case 2:
            // Pedir base
            pedirBaseRectangulo();
            // Leer base
            double baseRectangulo = leerDouble();
            // Pedir altura
            pedirAlturaRectangulo();
            // Leer altura
            double alturaRectangulo = leerDouble();
            // Calcular área
            double areaRectangulo = (baseRectangulo * alturaRectangulo);
            // Calcular perímetro
            double perimetroRectangulo = baseRectangulo + alturaRectangulo + baseRectangulo + alturaRectangulo;
            escribirResultado(areaRectangulo, perimetroRectangulo);

            break;

        case 3:
            // Pedir Lado
            pedirLadoCuadrado();
            // Leer el lado
            double ladoCuadrado = leerDouble();
            // Calcular área
            double areaCuadrado = (ladoCuadrado * ladoCuadrado);
            // Calcular perímetro
            double perimetroCuadrado = (ladoCuadrado * 4);
            // Escribir resultado
            escribirResultado(areaCuadrado, perimetroCuadrado);

            break;

        case 4:
            // Pedir numero de lados del poligono
            pedirNumeroLados();
            // Leer numero de lados
            double numLadosPoligono = leerDouble();
            // Pedir lado
            ladoPoligono();
            // Leer lados
            double ladoPoligono = leerDouble();
            // Pedir apotema
            pedirApotema();
            // Leer apotema
            double apotemaPoligono = leerDouble();
            // Calcular perimetro
            double perimetroPoligono = ladoPoligono * numLadosPoligono;
            // Calcular area
            double areaPoligono = (perimetroPoligono * apotemaPoligono) / 2;
            escribirResultado(areaPoligono,perimetroPoligono);

            break;

    }
}while (true);


    }

    private static void ladoPoligono() {
        System.out.print("Escriba el lado del polígono: ");
    }

    private static void pedirApotema() {
        System.out.print("Escriba el apotema del poligono: ");
    }

    private static void pedirNumeroLados() {
        System.out.print("Escriba el número de lados que tiene el polígono: ");
    }

    private static void pedirLadoCuadrado() {
        System.out.print("Escriba el lado del cuadrado: ");
    }

    private static void pedirAlturaRectangulo() {
        System.out.print("Escriba la altura del rectángulo: ");
    }

    private static void pedirBaseRectangulo() {
        System.out.print("Escriba la base del rectángulo: ");
    }

    private static void escribirResultado(double area, double perimetro) {
        System.out.println("El área es " + area + " y el perímetro es " + perimetro);
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
                "4. Polígono (Elija el número de lados) \n" +
                "0. Salir\n" +
                "Escoja una opción: ");
    }
}
