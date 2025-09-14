import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triangulo: ");
        altura = scanner.nextDouble();

        scanner.close();
        area = (base * altura) / 2;
        System.out.println("El area es: " + area);
    }
}
