package com.liceolapaz.des.dsv;

import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

            //Se crea la entrada para la cantidad de números
            System.out.print("Introduce la cantidad de números que quieres sumar: ");
            Scanner teclado = new Scanner(System.in);
            int N = teclado.nextInt();

            // Establecemos la variable número
            int numero = 0;

            // Con bucle for, a la vez que se van añadiendo los números se van sumando hasta llegar a N
            for (int i = 1; i <= N; i++) {
                System.out.print("Introduce número: ");
                numero += teclado.nextInt();
            }

            // Se imprime el resultado
            System.out.println("El resultado de la suma es: " + numero);
        }
}
