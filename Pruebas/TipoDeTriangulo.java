import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Los lados deben ser números positivos.");
        } else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("No se puede formar un triángulo con esos lados.");
        }

        scanner.close();
    }
}
