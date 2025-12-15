public class LlenarArrayConBucleFor {
    public static void main(String[] args) {
        // Crear un array bidimensional
        int[][] matriz = new int[3][4];

        // Llenar el array con un bucle for
        // el bucle "i" recorre las filas
        for (int i = 0; i < matriz.length; i++) {
            // el bucle "j" recorre las columnas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * matriz[i].length + j + 1;
            }
        }

        // Imprimir el array para verificar su contenido
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            // separar filas con un salto de línea
            System.out.println();
        }
    }
}
