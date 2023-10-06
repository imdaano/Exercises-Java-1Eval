package Principal;

import java.util.Scanner;

public class Principal  {
    public static void main(String[] args) {
        // Pedir un número al usuario
            pedirNumero();
        // Leer número y guardarlo en variable
            int numeroUsuario = leerNumero();
        // Realizar comprobación
            String mensaje = comprobarNumero(numeroUsuario);
        // Imprimir resultado
            escribirMensaje(mensaje);
    }




    private static void pedirNumero() {
        System.out.print("Buenos días, escriba un número: ");
    }
    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in); // Variable para leer el teclado. Acceder a Scanner
        return teclado.nextInt();
    }
    private static String comprobarNumero(int numeroUsuario) {
        String mensajeUsuario = (numeroUsuario == 0)?
                "El número 0 no es par ni impar":
                (numeroUsuario % 2 == 0) ?
                "El número es par.":"El número es impar.";
            return mensajeUsuario;
    }
    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
