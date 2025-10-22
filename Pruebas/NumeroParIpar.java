import java.util.Scanner;

public class NumeroParIpar {
    public static void main(String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}
