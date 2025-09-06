import java.util.Scanner;

public class Practica01 {
    public static void main(String args[]) {
        String name = "";
        int id = 0, antiqueity = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de consulta de empleados");
        System.out.print("Ingrese su nombre: ");
        name = scanner.nextLine();

        System.out.print("Ingrese su ID de apartamento: ");
        id = scanner.nextInt();

        System.out.print("Ingrese sus años de servicio: ");
        antiqueity = scanner.nextInt();

        if (id == 1 && antiqueity == 1) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 6 días de vacaciones.");
        } else if (id == 1 && antiqueity >= 2 && antiqueity <= 6) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 14 días de vacaciones.");
        } else if (id == 1 && antiqueity >= 7) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 20 días de vacaciones.");
        } else if (id == 2 && antiqueity == 1) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 7 dias de vacaciones.");
        } else if (id == 2 && antiqueity >= 2 && antiqueity <= 6) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 15 días de vacaciones.");
        } else if (id == 2 && antiqueity >= 7) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 22 días de vacaciones.");
        } else if (id == 3 && antiqueity == 1) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 10 días de vacaciones.");
        } else if (id == 3 && antiqueity >= 2 && antiqueity <= 6) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 20 días de vacaciones.");
        } else if (id == 3 && antiqueity >= 7) {
            System.out.println("Bienvenido " + name + ", tiene derecho a 30 días de vacaciones.");
        } else {
            System.out.println("No se encontró información para el ID o antigüedad proporcionados.");
        }
    }
}
