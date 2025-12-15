import javax.swing.JOptionPane;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        long [][] datos = new long[8][5];
        int numero;
        int factorial;
        StringBuilder tabla = new StringBuilder();

        tabla.append("Número\tCuadrado\tCubo\tSuma\tFactorial\n");

        for (int i = 0; i < datos.length; i++) {
            numero = i + 1;

            // numero
            datos[i][0] = numero;

            // cuadrado
            datos[i][1] = numero * numero;

            // cubo
            datos[i][2] = numero * numero * numero;

            // suma de numero al numero
            datos[i][3] = numero * (numero + 1) / 2;

            // factorial
            factorial = 1;
            for (int k = 0; k <= numero; k++) {
                factorial *= k;
            }
            datos[i][4] = factorial;
        }

        for (int i = 0; i < datos.length; i++) {
            tabla.append(String.format("%d\t%d\t\t%d\t%d\t%d\n",
                    datos[i][0],
                    datos[i][1],
                    datos[i][2],
                    datos[i][3],
                    datos[i][4]));
        }

        JOptionPane.showMessageDialog(null, tabla.toString(), "Operaciones Matemáticas", JOptionPane.INFORMATION_MESSAGE);
    }
}
