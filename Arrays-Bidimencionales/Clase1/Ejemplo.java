public class Ejemplo {
    // Inicialización e impresión: Declara un arreglo bidimensional 
    // int de 2×3 y asígnale valores enteros cualquiera. 
    // Luego recorre el arreglo con bucles anidados 
    // y muestra cada elemento por pantalla.

    public static void main(String[] args) {
        // Declaración e inicialización del arreglo 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Recorrido e impresión de los elementos del arreglo
        // Recorremos las filas
        for (int i = 0; i < matriz.length; i++) {
            // Recorremos las columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
