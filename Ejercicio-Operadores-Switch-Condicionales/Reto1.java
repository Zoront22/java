// Leer el nombre, tipo de empleado y sueldo de un empleado; que imprima
// el incremento de sueldo y su nuevo sueldo de acuerdo a lo siguiente; si es
// tipo de empleado 1 se le aumentará el 5%, si es tipo 2 se le aumentará el 7%,
// si es tipo 3 el 9%, si es tipo 4 el 12% y si es 5 el 15%. Verificar que el tipo del
// empleado se encuentre en el rango de 1 y 5, también validar que el sueldo del
// empleado sea mayor a 0.

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int tipoEmpleado;
        double sueldo, nuevoSueldo;
        double incremento = 0;

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el tipo de empleado (1-5): ");
        tipoEmpleado = scanner.nextInt();

        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = scanner.nextDouble();

        // verificar que el sueldo sea mayor a 0
        if (sueldo <= 0) {
            System.out.println("El sueldo debe ser mayor a 0.");
            return;
        }

        // determinar el incremento según el tipo de empleado
        switch (tipoEmpleado) {
            case 1:
                incremento = 0.05;
                break;
            case 2:
                incremento = 0.07;
                break;
            case 3:
                incremento = 0.09;
                break;
            case 4:
                incremento = 0.12;
                break;
            case 5:
                incremento = 0.15;
                break;
            default:
                System.out.println("Tipo de empleado inválido. Debe estar entre 1 y 5.");
                return;
        }

        // calcular el nuevo sueldo
        nuevoSueldo = sueldo + (sueldo * incremento);

        // imprimir el resultado
        System.out.printf("Empleado: %s%n", nombre);
        System.out.printf("Incremento de sueldo: %.2f%n", sueldo * incremento);
        System.out.printf("Nuevo sueldo: %.2f%n", nuevoSueldo);

        // printf esta función permite dar formato a la salida como ""%.2f" que indica
        // que se mostrará un número flotante con 2 decimales.
    }
}
