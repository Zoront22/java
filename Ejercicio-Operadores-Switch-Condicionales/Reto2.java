// Calcular e imprimir los valores de X y Y, teniendo como entrada el valor
// de X y calculando el valor de Y de acuerdo a las siguientes expresiones;
// Si X < 0 entonces Y = 3 X + 6
// Si X >= 0 entonces Y = X2 + 6 

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;

        System.out.print("Ingrese el valor de X: ");
        x = scanner.nextDouble();

        // calcular el valor de Y según la condición dada
        if (x < 0) {
            y = 3 * x + 6;
        } else {
            y = x * x + 6;
        }

        // imprimir el resultado
        System.out.printf("El valor de Y es: %.2f%n", y);
    }
}
