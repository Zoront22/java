package aplicacion;

import javax.swing.JOptionPane;
/**
 * Write a description of class PrimerosNPrimos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimerosNPrimos
{
    public static void main(String args[]) {
        int n = 0;
        int[] numerosPrimos;
        int contador, numero;
        StringBuilder resultado = new StringBuilder();
        
        // Entrada de datos
        boolean datosValidos = false;
        while (!datosValidos) {
            try {
                String input = JOptionPane.showInputDialog("Ingrese la cantidad de números primos a generar: ");
                
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Programa cancelado por el usuario.");
                    System.exit(0);
                }
                
                n = Integer.parseInt(input);
                
                if (n > 0) {
                    datosValidos = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: N debe ser un número positivo mayor a 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número entero válido.");
            }
        }
        
        // generar numeros primos en casos especificos
        numerosPrimos = new int[n];
        
        if (n >= 1) {
            numerosPrimos[0] = 2;        
        }
        if (n >= 2) {
            numerosPrimos[1] = 3;        
        }
        
        contador = 2;
        numero = 5;
        
        // comprobar si son primos
        while (contador < n) {
            boolean isPrimo = true;
            for (int i = 0; i < contador; i++) {
                if (numerosPrimos[i] * numerosPrimos[i] > numero) {
                    break;
                }
                if (numero % numerosPrimos[i] == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                numerosPrimos[contador] = numero;
                contador ++;
            }
            // avanzar al siguiente numero impar
            numero += 2;
        }
        
        // salida 
        resultado.append("Los primeros ").append(n).append(" números primos son:\n\n");
        
        for (int i = 0; i < n; i++) {
            resultado.append(String.format("%3d", (i + 1))).append(": ").append(numerosPrimos[i]);
        }
    }
}