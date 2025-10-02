import java.util.Scanner;

public class AreaTrianguloTresLados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, s, area;

        System.out.print("Digite el valor del lado a: ");
        a = teclado.nextDouble();

        System.out.print("Digite el valor del lado b: ");
        b = teclado.nextDouble();

        System.out.print("Digite el valor del lado c: ");
        c = teclado.nextDouble();

        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("El área del triángulo es: %.2f\n", area);
    }
}
