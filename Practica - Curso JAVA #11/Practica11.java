import java.util.Scanner;

public class Practica11 {
    public static void main(String args[]) {
        int param = 0;
        int x = 5, y = 3, result = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero para X:");
        param = in.nextInt();

        // "SWITCH" Es una estructura de control utilizando parametros y casos
        switch (param) {
            case 1:
                result = x + y;
                System.out.println("El resultado es: " + result);
                break;

            case 2:
                result = x - y;
                System.out.println("El resultado es: " + result);
                break;

            case 3:
                result = x * y;
                System.out.println("El resultado es: " + result);
                break;

            case 4:
                result = x / y;
                System.out.println("El resultado es: " + result);
                break;
        }
    }
}