import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = teclado.nextInt();

        if (num1 != num2 && num2 != num3 && num3 != num1) {
            if (num1 > num2 && num1 > num3) {
                System.out.println("El número mayor es: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println("El número mayor es: " + num3);
            }
        } else {
            System.out.println("Error: no se pueden ingresar números iguales.");
        }
    }
}