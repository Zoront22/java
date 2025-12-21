// Ejemplo de un bucle do-while en Java

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Bucle do-while para solicitar un número positivo
        // Este bucle sirve para atrapar errores de entrada del usuario
        do {
            System.out.print("Por favor, ingrese un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0); // La condición se evalúa después de ejecutar el bloque

        // Hata que el usuario ingrese un número positivo se repetirá el bucle
        // pidiendole el mismo dato

        System.out.println("Gracias! Ha ingresado el número positivo: " + numero);
        scanner.close();
    }
}