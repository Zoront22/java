// Calcular el precio de un terreno regular del cual se tienen el largo, el ancho
// y el precio por metro cuadrado. Si el terreno tiene más de 400 m2se hace un
// descuento del 10%, si tiene más de 500m2 un 17% y si tiene más de 1000 m2
// el descuento es de 25%. Validar que el largo, ancho y precio sean mayor que
// 0.

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largo, ancho, precioPorMetroCuadrado;
        double area, precioTotal, descuento = 0;

        System.out.print("Ingrese el largo del terreno (m): ");
        largo = scanner.nextDouble();

        System.out.print("Ingrese el ancho del terreno (m): ");
        ancho = scanner.nextDouble();

        System.out.print("Ingrese el precio por metro cuadrado: ");
        precioPorMetroCuadrado = scanner.nextDouble();

        // validar que largo, ancho y precio sean mayores que 0
        if (largo <= 0 || ancho <= 0 || precioPorMetroCuadrado <= 0) {
            System.out.println("El largo, ancho y precio por metro cuadrado deben ser mayores que 0.");
            return;
        }

        // calcular el área del terreno
        area = largo * ancho;

        // determinar el descuento según el área
        if (area > 1000) {
            descuento = 0.25;
        } else if (area > 500) {
            descuento = 0.17;
        } else if (area > 400) {
            descuento = 0.10;
        }

        // calcular el precio total con descuento
        precioTotal = area * precioPorMetroCuadrado * (1 - descuento);

        // imprimir el resultado
        System.out.printf("Área del terreno: %.2f m²%n", area);
        System.out.printf("Descuento aplicado: %.2f%%%n", descuento * 100);
        System.out.printf("Precio total del terreno: %.2f%n", precioTotal);
    }
}
