package com.liceolapaz.des.dsv;

public class Principal {
    public static void main(String[] args) {
        int exponente = 0;
        int resultado = 1;

        // Realizar un programa q calcule y visualice las potencias de 2 entre 0 y 10.
        System.out.println("Potencias de 2 entre 0 y 10:");

        while (exponente <= 10) {
            System.out.println("2g^" + exponente + " = " + resultado);
            exponente++;
            resultado *= 2;
        }
    }
}
