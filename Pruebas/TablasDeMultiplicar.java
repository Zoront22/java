
import javax.swing.JOptionPane;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int[][] tablas = new int[10][10];
        String input;
        int numero;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        while (true) { 
            input = JOptionPane.showInputDialog(null, "Ingrese un número del 1 al 10 para ver su tabla de multiplicar: ");
            
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Programa terminado.");
                break;
            }

            try {
                numero = Integer.parseInt(input);
                if (numero < 1 || numero > 10) {
                    JOptionPane.showMessageDialog(null, "Número inválido. Debe ser entre 1 y 10.");
                    continue;
                }

                resultado.append("Tabla del ").append(numero).append(":\n");

                for (int i = 0; i < 10; i++) {
                    resultado.append((i + 1)).append(" x ").append(numero).append(" = ").append(tablas[i][numero - 1]).append("\n");
                }

                JOptionPane.showMessageDialog(null, resultado.toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese un numero del 1 al 10.");
            }
        }
    }
}
