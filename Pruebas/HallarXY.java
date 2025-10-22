import java.util.Scanner;

public class HallarXY {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, y;

        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextDouble();

        if (x < 0) {
            y = 3 * x + 6;
            System.out.printf("El valor de y es: %.2f%n", y);
        } else {
            y = x * 2 + 6;
            System.out.printf("El valor de y es: %.2f%n", y);
        }
    }
}
