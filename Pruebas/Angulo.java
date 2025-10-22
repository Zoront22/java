import java.util.Scanner;

public class Angulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo;

        System.out.print("Introduce un ángulo en grados: ");
        angulo = teclado.nextDouble();

        if (angulo >= 0 && angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("El ángulo es obtuso.");
        } else if (angulo == 180) {
            System.out.println("El ángulo es llano.");
        } else if (angulo > 180 && angulo < 360) {
            System.out.println("El ángulo es cóncavo.");
        } else {
            System.out.println("El valor introducido no es válido.");
        }
    }
}
