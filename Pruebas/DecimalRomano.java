import java.util.Scanner;

public class DecimalRomano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero (1-3999) para convertir a romano:");

        if (!teclado.hasNextInt()) {
            System.out.println("Entrada no válida. Se esperaba un número entero.");
            return;
        }

        int decimal = teclado.nextInt();

        if (decimal <= 0 || decimal > 3999) {
            System.out.printf("Valor fuera de rango (1-3999): %d\n", decimal);
            return;
        }

        String romano = toRoman(decimal);
        System.out.printf("%d -> %s\n", decimal, romano);
    }

    // Convierte un entero entre 1 y 3999 a número romano
    public static String toRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}