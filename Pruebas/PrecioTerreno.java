import java.util.Scanner;

public class PrecioTerreno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double largo, ancho, precioPorMetroCuadrado, area, precioTotal;

        System.out.print("Ingrese el largo del terreno en metros: ");
        largo = teclado.nextDouble();

        System.out.print("Ingrese el ancho del terreno en metros: ");
        ancho = teclado.nextDouble();

        System.out.print("Ingrese el precio por metro cuadrado: ");
        precioPorMetroCuadrado = teclado.nextDouble();

        if (largo > 0 && ancho > 0 && precioPorMetroCuadrado > 0) {
            area = largo * ancho;
            precioTotal = area * precioPorMetroCuadrado;
            System.out.printf("El área del terreno es: %.2f metros cuadrados%n", area);

            if (area > 400) {
                precioTotal *= 0.90; // Aplicar 10% de descuento
                System.out.printf("El precio total con descuento es: %.2f%n", precioTotal);
            } else if (area > 500) {
                precioTotal *= 0.83; // Aplicar 17% de descuento
                System.out.printf("El precio total con descuento es: %.2f%n", precioTotal);
            } else if (area > 1000) {
                precioTotal *= 0.75; // Aplicar 25% de descuento
                System.out.printf("El precio total con descuento es: %.2f%n", precioTotal);
            } else {
                System.out.printf("El precio total es: %.2f%n", precioTotal);
            }
        } else {
            System.out.println("Introduzca valores válidos.");
            return;
        }
    }
}
