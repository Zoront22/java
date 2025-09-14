import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radio;
        double pi = 3.1416;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        radio = scanner.nextDouble();

        area = pi * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}
