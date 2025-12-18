// Construya un programa que capture la edad de los integrantes de un equipo de 25
// jugadores. Se desea conocer cuántos tienen una edad mayor a 30 años.

import javax.swing.JOptionPane;

public class EdadesJugadores
{
    public static void main(String args[]) {
        int[] edades = new int[25];
        int mayoresA30 = 0;
        int edad;
        
        // Pedir y validar datos
        for (int i = 0; i < edades.length; i++) {
            boolean datoValido = false;
            
            while (!datoValido) {
                try {
                    String input = JOptionPane.showInputDialog("Ingrese la edad del jugador " + (i + 1) + ":");
                    
                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Programa cancelado.");
                        return;
                    }
                    
                    edad = Integer.parseInt(input);
                    
                    // verificar edades
                    if (edad > 0) {
                        edades[i] = edad;
                        if (edad > 30) {
                            mayoresA30++;
                        }
                        datoValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 0.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
                }
            }
        }
        
        // salida de datos
        JOptionPane.showMessageDialog(null, "De 25 jugadores, " + mayoresA30 + " son mayores de 30 años.");
    }
}