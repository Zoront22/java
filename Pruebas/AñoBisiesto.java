import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int year;

        System.out.print("Ingrese un año: ");
        year = teclado.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }
}
