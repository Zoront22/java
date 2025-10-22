import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDeCalificaciones;
        double calificacion, promedio;
        double suma = 0.0;

        // atrapar el error en bucle
        while (true) {
            System.out.print("Ingrese el numero de calificaciones: ");
            if (teclado.hasNextInt()) {
                numeroDeCalificaciones = teclado.nextInt();
                if (numeroDeCalificaciones < 0) {
                    System.out.println("El numero debe ser positivo. Intente nuevamente.");
                    continue;
                }
                break;
            } else {
                System.out.println("Entrada invalida. Ingrese un entero positivo.");
                teclado.next(); // token invalido
            }
        }

        // Leer cada calificacion y validarla (0-100)
        for (int i = 1; i <= numeroDeCalificaciones; i++) {
            while (true) {
                System.out.print("Ingrese la calificacion #" + i + " (0-100): ");
                if (teclado.hasNextDouble()) {
                    calificacion = teclado.nextDouble();
                    if (calificacion < 0 || calificacion > 100) {
                        System.out.println("Calificacion fuera de rango. Debe estar entre 0 y 100.");
                        continue;
                    }
                    suma += calificacion;
                    break;
                } else {
                    System.out.println("Entrada invalida. Ingrese un numero (puede tener decimales).");
                    teclado.next(); // token invalido
                }
            }
        }

        promedio = suma / numeroDeCalificaciones;
        System.out.printf("Promedio: %.2f\n", promedio);
        teclado.close();
    }
}
