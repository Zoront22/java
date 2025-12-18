public class Clase5 {
    public static void main(String args[]) {

        int operacion = 1;
        int n1 = 8;
        int n2 = 4;
        int resultado = 0;

        if (operacion == 1) {
            resultado = n1 + n2;
            System.out.println("Resultado de la suma: " + resultado);
        } else if (operacion == 2) {
            resultado = n1 - n2;
            System.out.println("Resultado de la resta: " + resultado);
        } else if (operacion == 3) {
            resultado = n1 * n2;
            System.out.println("Resultado de la multiplicación: " + resultado);
        } else if (operacion == 4) {
            resultado = n1 / n2;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("Operación no válida");
        }
    }
}
