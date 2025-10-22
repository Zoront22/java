import java.util.Scanner;

public class Empleados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int tipoEmpleado;
        double salarioBase, salarioFinal;

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese el tipo de empleado (1, 2, 3, 4 o 5): ");
        tipoEmpleado = teclado.nextInt();

        System.out.print("Ingrese el salario base del empleado: ");
        salarioBase = teclado.nextDouble();

        if (salarioBase > 0) {

            switch (tipoEmpleado) {
                case 1:
                    salarioFinal = salarioBase * 1.05; // 5% de aumento
                    break;
                case 2:
                    salarioFinal = salarioBase * 1.07; // 7% de aumento
                    break;
                case 3:
                    salarioFinal = salarioBase * 1.09; // 9% de aumento
                    break;
                case 4:
                    salarioFinal = salarioBase * 1.12; // 12% de aumento
                    break;
                case 5:
                    salarioFinal = salarioBase * 1.15; // 15% de aumento
                    break;
                default:
                    System.out.println("Tipo de empleado no válido.");
                    return;
            }
            System.out.printf("El salario final de %s es: %.2f%n", nombre, salarioFinal);
        } else {
            System.out.println("Introduzca un valor válido.");
            return;
        }
    }
}
