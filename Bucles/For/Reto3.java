// Pedirle al usuario un número entero y calcular su factorial

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; // Número de ejemplo
        int factorial = 1;

        System.out.print("Ingrese un número entero para calcular su factorial: ");
        numero = scanner.nextInt();

        // Bucle para calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Equivalente a factorial = factorial * i
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
