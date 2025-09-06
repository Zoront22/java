import java.util.Scanner;

public class Practica {
    public static void main(String args[]) {
        Scanner option = new Scanner(System.in);
        int num_x = 0, num_y = 0, operation = 0, result = 0;

        System.out.println("Introduce el primer número:");
        num_x = option.nextInt();

        System.out.println("Introduce el segundo numero:");
        num_y = option.nextInt();

        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        operation = option.nextInt();

        if (operation == 1) {
            result = num_x + num_y;
            System.out.println("Resultado de la suma: " + result);
        } else if (operation == 2) {
            result = num_x - num_y;
            System.out.println("Resultado de la resta: " + result);
        } else if (operation == 3) {
            result = num_x * num_y;
            System.out.println("Resultado de la multiplicación: " + result);
        } else if (operation == 4) {
            if (num_y != 0) {
                result = num_x / num_y;
                System.out.println("Resultado de la división: " + result);
            } else {
                System.out.println("Error: División por cero no permitida.");
            }
        } else {
            System.out.println("Operación no válida");
        }
    }
}
