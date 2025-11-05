import java.util.Scanner;

class XElevadoAY {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y;
        int resultado = Math.pow(x, y);

        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextInt();
        System.out.print("Ingrese el valor de y: ");
        y = teclado.nextInt();

        System.out.println(x + " elevado a " + y + " es igual a " + resultado);
    }

}