import java.util.Scanner;

public class Tarea {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        char sexo;
        int edad;
        double pagoDeSeguro;

        System.out.print("Ingrese su sexo (H para hombre, M para mujer): ");
        sexo = teclado.next().charAt(0);
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        if (sexo == 'H' || sexo == 'h') {
            if (edad < 17) {
                pagoDeSeguro = 700.00;
            } else if (edad >= 17 && edad < 40) {
                pagoDeSeguro = 1500.00;
            } else {
                pagoDeSeguro = 1200.00;
            }
        } else if (sexo == 'M' || sexo == 'm') {
            if (edad < 18) {
                pagoDeSeguro = 500.00;
            } else if (edad >= 18 && edad < 30) {
                pagoDeSeguro = 700.00;
            } else {
                pagoDeSeguro = 1000.00;
            }
        } else {
            System.out.println("Sexo no válido. Por favor ingrese 'H' para hombre o 'M' para mujer.");
            teclado.close();
            return;
        }
        System.out.printf("El pago de seguro es: $%.2f%n", pagoDeSeguro);
    }
}