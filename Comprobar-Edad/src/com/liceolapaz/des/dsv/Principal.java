package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Preguntar el año de nacimiento
        pedirAnho();
        // Leer la edad del usuario y almacenar
        int anhoNacimiento = edadIntroducida();
        // Calcular la edad actual (resta de año actual - año de nacimiento) y guardarlo
            String mensaje = comprobarAnhoNacimiento(anhoNacimiento);
        // Mensaje al usuario
            escribirMensaje(mensaje);
    }




    private static void pedirAnho() {
        System.out.print("Buen día, introduzca año de nacimiento: ");
    }
    private static int edadIntroducida() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    private static String comprobarAnhoNacimiento(int anhoNacimiento) {
        String mensaje;
            int edad = 2023 - anhoNacimiento;
            if (anhoNacimiento > 2023) {
                mensaje = "No puedes haber nacido en el futuro";
            } else if (edad > 150) {
                mensaje = "No puedes tener tantos años";
            } else if (edad >= 18) {
                mensaje = "Tienes permiso para entrar";
            } else {
                mensaje = "No puedes pasar";
            }
        return  mensaje;
    }
    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
