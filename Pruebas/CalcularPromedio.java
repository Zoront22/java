import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        double calificacion1, calificacion2, calificacion3, promedio;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera calificación: ");
        calificacion1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        calificacion2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        calificacion3 = scanner.nextDouble();

        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.printf("El promedio es: %.2f%n", promedio);
    }
}
