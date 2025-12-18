// Elabore un programa que capture las llamadas de cada mes del año 2016, y calcule el
// promedio mensual de llamadas por mes.


import javax.swing.JOptionPane;

public class HistorialLLamadasMensual
{
    public static void main(String args[]) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] llamadas = new int[12];
        int totalLlamadas = 0;
        double promedio = 0;
        String salida;
        
        JOptionPane.showMessageDialog(null, "Historial de llamadas del 2016\nIngrese la cantidad de llamadas que hizo en cada mes: ");
        
        // Pedir datos
        for (int i = 0; i < meses.length; i++) {
            boolean entradaValida = false;
            
            while (!entradaValida) {
                try {
                    String input = JOptionPane.showInputDialog("Ingrese las llamadas de " + meses[i] + ":");
                    if (input == null) {
                        input = "0"; 
                    }
                    
                    llamadas[i] = Integer.parseInt(input);
                    
                    if (llamadas[i] > 0) {
                        entradaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: Ingrese un valor mayor o igual a 0");
                    }
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR: Ingrese un valor");
                }
            }
        }
        
        // Calcular datos
        for (int i = 0; i < llamadas.length; i++) {
            totalLlamadas += llamadas[i];
        }
        
        promedio = (double) totalLlamadas / meses.length;
        
        // salida 
        salida = "Promedio de llamadas 2016\n\n";
        salida += "Llamadas en cada mes: ";
        
        for (int i = 0; i < meses.length; i++) {
            salida += meses[i] + " :" + llamadas[i] + "llamadas";
        }
        
        salida = "Total de llamadas anual: " + totalLlamadas;
        salida = "Promedio Mensual:" + String.format("%.2f",promedio) + " llamadas";
        
        JOptionPane.showMessageDialog(null, salida, "Resultados 2016", JOptionPane.INFORMATION_MESSAGE);
    }
}