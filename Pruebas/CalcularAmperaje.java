import java.util.Scanner;

public class CalcularAmperaje {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double voltaje, resistencia, amperaje;

        System.out.print("Digite el valor del voltaje (V): ");
        voltaje = teclado.nextDouble();

        System.out.print("Digite el valor de la resistencia (Ω): ");
        resistencia = teclado.nextDouble();

        amperaje = voltaje / resistencia;

        System.out.printf("El amperaje (I) es: %.2f A\n", amperaje);
    }
}
