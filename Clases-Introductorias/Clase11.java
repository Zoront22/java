
public class Clase11 {

    public static void main(String args[]) {
        int param = 2;
        int x = 5, y = 3, result = 0;

        // "SWITCH" Es una estructura de control utilizando parametros y casos
        switch (param) {
            // si el parametro es igual a 1
            case 1:
                result = x + y;
                System.out.println("El resultado es: " + result);
                break; // termina el case

            // si el parametro es igual a 2
            case 2:
                result = x - y;
                System.out.println("El resultado es: " + result);
                break;

            // si el parametro es igual a 3
            case 3:
                result = x * y;
                System.out.println("El resultado es: " + result);
                break;

            // si el parametro es igual a 4
            case 4:
                result = x / y;
                System.out.println("El resultado es: " + result);
                break;
        }
    }
}
