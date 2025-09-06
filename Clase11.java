public class Clase11 {
    public static void main(String args[]) {
        int param = 2;
        int x = 5, y = 3, result = 0;

        // "SWITCH" Es una estructura de control utilizando parametros y casos
        switch (param) {
            case 1:
                result = x + y;
                System.out.println("El resultado es: " + result);
                break;

            case 2:
                result = x - y;
                System.out.println("El resultado es: " + result);
                break;

            case 3:
                result = x * y;
                System.out.println("El resultado es: " + result);
                break;

            case 4:
                result = x / y;
                System.out.println("El resultado es: " + result);
                break;
        }
    }
}