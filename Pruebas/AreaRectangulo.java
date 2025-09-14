import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String args[]) {
        // Variables
        double bass;
        double height;
        double area;

        // Introducir datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        bass = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectangulo: ");
        height = scanner.nextDouble();

        area = bass * height;

        System.out.println("El area es: " + area);

        // Cerrar el scanner para dejar de recibir parametros por el usuario
        scanner.close();
    }
}
