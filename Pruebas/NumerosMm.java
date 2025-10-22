import java.util.Scanner;

public class NumerosMm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, numero, mayor, menor;

        do {
            System.out.print("Ingrese la cantidad de numeros a comparar: ");
            n = teclado.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, ingrese un numero mayor que cero.");
            }
        } while (n <= 0);

        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();

        mayor = numero;
        menor = numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Ingrese otro numero: ");
            numero = teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        teclado.close();
    }
}
