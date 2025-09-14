import java.util.Scanner;

public class CaF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int celsius, fahrenheit;

        System.out.print("Introduce grados Celsius: ");
        celsius = teclado.nextInt();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit");
    }
}
