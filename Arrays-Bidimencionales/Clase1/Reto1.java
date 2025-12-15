public class Reto1 {
    // Rellena una matriz con numeros de dos en dos,
    // pero dejando unicamente el numero 0 
    // en todas las columnas pares.
    public static void main(String[] args) {
        // Declaracion de la matriz
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // si la columna es par, entonces asignar 0
                if (j % 2 == 0) {
                    matriz[i][j] = 0;
                } else {
                    // si la columna es impar, asignar numeros de dos en dos
                    matriz[i][j] = (i * matriz.length + j) * 2;
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            
            System.out.println();
        }
    }
}
