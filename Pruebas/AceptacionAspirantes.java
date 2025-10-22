import java.util.Scanner;

public class AceptacionAspirantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int ficha;
        String nombre;
        double calificacion1, calificacion2;

        System.out.print("Ingrese el numero de ficha: ");
        ficha = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingrese el nombre del aspirante: ");
        nombre = teclado.nextLine();

        do {
            System.out.print("Ingrese la primer calificacion: ");
            calificacion1 = teclado.nextDouble();
        } while (calificacion1 < 0 || calificacion1 > 100);

        do {
            System.out.print("Ingrese la segunda calificacion: ");
            calificacion2 = teclado.nextDouble();
        } while (calificacion2 < 0 || calificacion2 > 100);

        if (calificacion1 >= 70 && calificacion2 >= 70) {
            System.out.println("El aspirante " + nombre + " con ficha " + ficha + " ha sido ACEPTADO");
        } else {
            System.out.println("El aspirante " + nombre + " con ficha " + ficha + " ha sido RECHAZADO");
        }

        teclado.close();
    }
}
