import java.util.Scanner;

public class Clase6 {
    public static void main(String args[]) {
        // Importante: Asegúrate de importar la clase Scanner
        // para poder introducir datos con ayuda de System para poder usar el teclado.
        Scanner in = new Scanner(System.in);
        String name = "";
        int num_X = 0, num_Y = 0, result = 0;

        System.out.println("Introduce tu nombre:");
        // pausar el programa y Guardar los datos en la variable name
        name = in.nextLine();

        System.out.println("Escribe un numero:");
        // Cambia "in.nextInt()" para gregar un numero entero.
        num_X = in.nextInt();

        System.out.println("Escribe otro numero:");
        num_Y = in.nextInt();

        result = num_X + num_Y;
        System.out.println("Hola " + name + ", el resultado de la suma es: " + result);
    }
}
