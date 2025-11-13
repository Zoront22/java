package aplicacion;

import javax.swing.JOptionPane;
/**
 * Write a description of class MesConMasLlamadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MesConMasLlamadas
{
    public static void main(String args[]) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] llamadas = new int[12];
        int totalDeLlamadas, mayorLlamadas, indiceMayor;
        
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
        
        mayorLlamadas = llamadas[0];
        indiceMayor = 0;
        
        for (int i = 0; i < meses.length; i++) {
            if (mayorLlamadas < llamadas[i]) {
                mayorLlamadas = llamadas[i];
                indiceMayor = i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El mes con mas llamadas es " + meses[indiceMayor] + "con un total de " + mayorLlamadas + " llamadas");
    }
}