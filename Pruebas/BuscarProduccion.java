import javax.swing.JOptionPane;

public class BuscarProduccion {
    public static void main(String[] args) {
        int [][] produccion = new int[4][2];
        StringBuilder resultados = new StringBuilder();
        boolean datosValidos = false;
        boolean encontrado = false;

        // pedir datos de producción
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion[i].length; j++) {
                while (!datosValidos) {
                    try {
                        String input = JOptionPane.showInputDialog("Ingrese la producción para el mes " + (i + 1) + ", semana " + (j + 1) + ":");

                        if (input == null) {
                            return;
                        }

                        produccion[i][j] = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                    }
                }
            }
        }

        // buscar produccion
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion[i].length; j++) {
                if (produccion[i][j] == 10000) {
                    resultados.append("Producción de 10000 encontrada en el mes ").append(i + 1).append(", semana ").append(j + 1).append(".\n");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            resultados.append("No se encontró producción de 10000.");
            JOptionPane.showMessageDialog(null, resultados.toString());
        } else {
            JOptionPane.showMessageDialog(null, resultados.toString());
        }
    }
}
