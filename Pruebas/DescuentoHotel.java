import java.util.Scanner;

public class DescuentoHotel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int noches;
        double precioNoche, subtotal, descuento, total;

        precioNoche = 100.0; // Precio fijo por noche

        System.out.print("Ingrese el número de noches que se hospedará: ");
        noches = teclado.nextInt();

        if (noches == 0) {
            System.out.println("ingrese un numero de noches valido");
            return;
        } else {
            if (noches >= 6 && noches <= 15) {
                descuento = 0.10; // 10% de descuento
                subtotal = noches * precioNoche;
                total = subtotal - (subtotal * descuento);
                System.out.printf("Subtotal: $%.2f\n", subtotal);
                System.out.printf("Descuento: $%.2f\n", subtotal * descuento);
                System.out.printf("Total a pagar: $%.2f\n", total);
            } else if (noches > 15) {
                descuento = 0.15; // 20% de descuento
                subtotal = noches * precioNoche;
                total = subtotal - (subtotal * descuento);
                System.out.printf("Subtotal: $%.2f\n", subtotal);
                System.out.printf("Descuento: $%.2f\n", subtotal * descuento);
                System.out.printf("Total a pagar: $%.2f\n", total);
            } else {
                subtotal = noches * precioNoche;
                System.out.printf("Total a pagar (sin descuento): $%.2f\n", subtotal);
            }
        }
    }
}
