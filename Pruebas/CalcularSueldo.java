import java.util.Scanner;

public class CalcularSueldo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double horaEntrada, horaSalida, horasTrabajadas, sueldo, sueldoFinal;
        sueldo = 2000;

        System.out.print("Digite la hora de entrada (formato 24h): ");
        horaEntrada = teclado.nextDouble();

        System.out.print("Digite la hora de salida (formato 24h): ");
        horaSalida = teclado.nextDouble();

        horasTrabajadas = horaSalida - horaEntrada;

        sueldoFinal = horasTrabajadas * sueldo;

        if (horasTrabajadas > 48) {
            sueldoFinal = horasTrabajadas * (sueldo * 2);
        } else {
            System.out.printf("El sueldo final es: %.2f\n", sueldoFinal);
        }
    }
}
