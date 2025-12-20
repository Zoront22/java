import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean esPar = false;

        while (!esPar) {
            System.out.print("Ingrese un número par: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("¡Correcto! El número " + numero + " es par.");
                esPar = true;
            } else {
                System.out.println("El número " + numero + " no es par. Inténtelo de nuevo.");
            }
        }
    }
}
