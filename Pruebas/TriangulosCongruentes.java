import java.util.Scanner;

public class TriangulosCongruentes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean valido = true;

        // primer triangulo
        System.out.print("Ingrese el valor de los lados del primer triangulo: ");
        double a1 = teclado.nextInt(), b1 = teclado.nextInt(), c1 = teclado.nextInt();

        System.out.print("Ingrese el valor de los angulos del primer triangulo: ");
        double ang1 = teclado.nextInt(), ang2 = teclado.nextInt(), ang3 = teclado.nextInt();

        // segundo triangulo
        System.out.print("Ingrese el valor de los lados del segundo triangulo: ");
        double a2 = teclado.nextInt(), b2 = teclado.nextInt(), c2 = teclado.nextInt();

        System.out.print("Ingrese el valor de los angulos del segundo triangulo: ");
        double ang4 = teclado.nextInt(), ang5 = teclado.nextInt(), ang6 = teclado.nextInt();

        teclado.close();

        // validaciones
        // verificar que sean positivos
        if (a1 <= 0 || b1 <= 0 || c1 <= 0 || ang1 <= 0 || ang2 <= 0 || ang3 <= 0 ||
                a2 <= 0 || b2 <= 0 || c2 <= 0 || ang4 <= 0 || ang5 <= 0 || ang6 <= 0) {
            System.out.println("ERROR: Los valores deben ser positivos.");
            valido = false;
        }

        // verificar que los angulos sumen 180
        if (ang1 + ang2 + ang3 != 180 || ang4 + ang5 + ang6 != 180) {
            System.out.println("ERROR: Los angulos no suman 180 grados.");
            valido = false;
        }

        // Congruencia o incongruencia
        if (valido) {
            if ((a1 == a2 && b1 == b2 && c1 == c2) || (a1 == a2 && ang2 == ang5 && ang3 == ang6) ||
                    (b1 == b2 && ang1 == ang4 && ang3 == ang6) || (c1 == c2 && ang1 == ang4 && ang2 == ang5) ||
                    (ang1 == ang4 && ang2 == ang5 && ang3 == ang6)) {
                System.out.println("Los triangulos son congruentes.");
            } else {
                System.out.println("Los triangulos no son congruentes.");
            }
        }
    }
}
