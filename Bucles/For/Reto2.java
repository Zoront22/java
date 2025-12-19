// Leer “N” números, y calcular el mayor y el menor.

public class Reto2 {
    public static void main(String[] args) {
        // Arreglo de números de ejemplo
        int[] numeros = { 34, 12, 5, 67, 23, 89, 1, 45 };
        int mayor = numeros[0];
        int menor = numeros.length - 1;

        // Bucle para encontrar el mayor y el menor número
        // numeros.length devuelve la cantidad de elementos en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
