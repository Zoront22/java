// Pide al usuario un numero entero 
// y muestra en pantalla la tabla de multiplicar de ese numero del 1 al 10.

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int resultado;

        System.out.print("Ingrese un número entero: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
