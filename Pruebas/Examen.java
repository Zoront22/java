import javax.swing.JOptionPane;

public class Examen {
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES Y ARRAYS
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        double[] produccionMensual = new double[12];
        double totalAnual = 0;
        double promedioAnual = 0;
        double mayorPromedio = 0;
        int mesMayorProduccion = 0;
        StringBuilder tabla = new StringBuilder();

        // ENTRADA DE DATOS
        JOptionPane.showMessageDialog(null, "REGISTRO DE PRODUCCIÓN MENSUAL 2024\nIngrese la producción de cada mes:");

        for (int i = 0; i < 12; i++) {
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    String input = JOptionPane.showInputDialog("Producción de " + meses[i] + " (unidades):");

                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Programa cancelado por el usuario.");
                        System.exit(0);
                    }

                    double produccion = Double.parseDouble(input);

                    if (produccion >= 0) {
                        produccionMensual[i] = produccion;
                        totalAnual += produccion;
                        entradaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: La producción no puede ser negativa.");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
                }
            }
        }

        // LÓGICA DE CÁLCULOS
        promedioAnual = totalAnual / 12;

        // Encontrar mes con mayor producción
        for (int i = 1; i < 12; i++) {
            if (produccionMensual[i] > produccionMensual[mesMayorProduccion]) {
                mesMayorProduccion = i;
            }
        }
        mayorPromedio = produccionMensual[mesMayorProduccion];

        // CONSTRUIR TABLA DE RESULTADOS
        tabla.append("EMPRESA DE PRODUCCIÓN - REPORTE ANUAL 2024\n");
        tabla.append("===========================================\n\n");
        tabla.append(String.format("%-15s %-20s %-15s\n", "MES", "PRODUCCIÓN MENSUAL", "PROMEDIO MENSUAL"));
        tabla.append("---------------------------------------------------------------\n");

        // Mostrar datos de cada mes
        for (int i = 0; i < 12; i++) {
            double promedioMensual = produccionMensual[i]; // En este caso, producción = promedio mensual

            tabla.append(String.format("%-15s %-20.2f %-15.2f",
                    meses[i], produccionMensual[i], promedioMensual));

            // Marcar el mes con mayor producción
            if (i == mesMayorProduccion) {
                tabla.append(" ← MAYOR PRODUCCIÓN");
            }
            tabla.append("\n");
        }

        tabla.append("---------------------------------------------------------------\n");

        // ESTADÍSTICAS FINALES
        tabla.append("\nESTADÍSTICAS ANUALES:\n");
        tabla.append("----------------------\n");
        tabla.append(String.format("Total producción anual: %,.2f unidades\n", totalAnual));
        tabla.append(String.format("Promedio anual de producción: %,.2f unidades/mes\n", promedioAnual));
        tabla.append(String.format("Mes con mayor producción: %s (%,.2f unidades)\n",
                meses[mesMayorProduccion], mayorPromedio));
        tabla.append(String.format("Producción total del mejor mes: %,.2f unidades\n", mayorPromedio));

        // Calcular porcentaje que representa el mejor mes
        double porcentajeMejorMes = (mayorPromedio / totalAnual) * 100;
        tabla.append(String.format("El mejor mes representa el %.1f%% de la producción anual\n", porcentajeMejorMes));

        // SALIDA DE RESULTADOS
        JOptionPane.showMessageDialog(null, tabla.toString(),
                "Reporte de Producción 2024",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
