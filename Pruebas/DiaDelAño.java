import java.util.Scanner;

public class DiaDelAño {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un numero del 1 al 365: ");
        numero = teclado.nextInt();

        if (numero > 0 && numero <= 365) {
            String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                    "Octubre", "Noviembre", "Diciembre" };
            int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            int mes = 0;
            while (numero > diasPorMes[mes]) {
                numero -= diasPorMes[mes];
                mes++;
            }

            System.out.printf("Tu dia del año es: %s %d\n", meses[mes], numero);
        } else {
            System.out.println("ingrese un numero del 1 al 365.");
        }

        // if (numero > 0 && numero <= 365) {
        // if (numero <= 31) {
        // System.out.println("Tu dia del año es: Enero " + numero);
        // } else if (numero <= 59) {
        // System.out.println("Tu dia del año es: Febrero " + (numero - 31));
        // } else if (numero <= 90) {
        // System.out.println("Tu dia del año es: Marzo " + (numero - 59));
        // } else if (numero <= 120) {
        // System.out.println("Tu dia del año es: Abril " + (numero - 90));
        // } else if (numero <= 151) {
        // System.out.println("Tu dia del año es: Mayo " + (numero - 120));
        // } else if (numero <= 181) {
        // System.out.println("Tu dia del año es: Junio " + (numero - 151));
        // } else if (numero <= 212) {
        // System.out.println("Tu dia del año es: Julio " + (numero - 181));
        // } else if (numero <= 243) {
        // System.out.println("Tu dia del año es: Agosto " + (numero - 212));
        // } else if (numero <= 273) {
        // System.out.println("Tu dia del año es: Septiembre " + (numero - 243));
        // } else if (numero <= 304) {
        // System.out.println("Tu dia del año es: Octubre " + (numero - 273));
        // } else if (numero <= 334) {
        // System.out.println("Tu dia del año es: Noviembre " + (numero - 304));
        // } else {
        // System.out.println("Tu dia del año es: Diciembre " + (numero - 334));
        // }
        // } else {
        // System.out.println("ingrese un numero del 1 al 365.");
        // }
    }
}
