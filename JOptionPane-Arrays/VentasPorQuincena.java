package aplicacion;

import javax.swing.JOptionPane;
/**
 * Write a description of class VentasPorQuincena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentasPorQuincena
{
    public static void main(String args[]) {
        double[] quincenas = new double[24];
        double[] trimestres = new double[4];
        String[] nombresTrimestres = {"Enero-Marzo", "Abril-Junio", "Julio-Septiembre", "Octubre-Diciembre"};
        double ventas;
        
        // entrada de datos
        for (int i = 0; i < quincenas.length; i++) {
            boolean datoValido = false;
            int quincena = i+1;
            
            while (!datoValido) {
                try {
                    String input = JOptionPane.showInputDialog("Ingrese las ventas de la quincena " + quincena + ":");
                    
                    ventas = Double.parseDouble(input);
                    
                    if (ventas >= 0) {
                        quincenas[i] = ventas;
                        datoValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Las ventas deben ser mayores a 0");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
                }
            }
        }
        
        // calculo por trimestre
        for (int i = 0; i < trimestres.length; i++) {
            double totalTrimestre = 0;
            int inicio = i * 6;
            int fin = inicio + 6;
            
            for (int a = inicio; a < fin; a++) {
                totalTrimestre += quincenas[a];
            }
            
            trimestres[i] = totalTrimestre;
        }
        
        // salida
        StringBuilder resultado = new StringBuilder();
        resultado.append("VENTAS POR TRIMESTRE:\n\n");
        
        for (int i = 0; i < 4; i++) {
            resultado.append(nombresTrimestres[i]).append(": $")
                     .append(String.format("%,.2f", trimestres[i])).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}