public class Reto3 {
    // Crea un arreglo int[4][4] 
    // inicialízalo con números enteros. 
    // Escribe un programa que calcule 
    // y muestre la suma de cada una de las 4 filas 
    // también la suma de cada una de las 4 columnas.

    public static void main(String[] args) {
        // Declaracion de variables
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaTotal = 0;

        // Suma de filas
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
                if (j == matriz[i].length - 1) {
                    System.out.println("La suma de la fila " + (i + 1) + " es: " + sumaFila);
                    sumaFila = 0;
                }
            }
        }

        // Suma de columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
                if (i == matriz.length - 1) {
                    System.out.println("La suma de la columna " + (j + 1) + " es: " + sumaColumna);
                    sumaColumna = 0;
                }
            }
        }

        // Suma total
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("La suma total de todos los elementos es: " + sumaTotal);
    }
}
