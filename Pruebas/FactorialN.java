import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        long factorial = 1;

        do {
            System.out.print("Ingrese un numero entero no negativo para calcular su factorial: ");
            n = teclado.nextInt();

            if (n < 0) {
                System.out.println("Por favor, ingrese un numero no negativo.");
            }
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}
