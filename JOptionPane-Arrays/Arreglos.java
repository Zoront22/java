import javax.swing.JOptionPane;

public class Arreglos
{
    public static void main(String[] args) {
        // Declaracion de variables
        // arreay de tipo double
        double[] dato;
        // variables a necesitar
        int cantidad, cantidadesMayoresA100;
        double suma, promedio;
        double mayor, menor;
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));

        // inicializar el array con la cantidad de elementos
        dato = new double[cantidad];
        
        suma = 0;
        
        // recorrer el array para llenarlo
        for (int i = 0; i < dato.length; i++) {
            dato[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dato " + (i + 1) + ":"));
            suma += dato[i];
        }
        
        promedio = suma / dato.length;
        // mayor = 0;
        // inicializar valores en el primer elemmento del array
        mayor = dato[0];
        // menor = 100;
        // inicializar en el ultimo dato para el menor
        menor = dato[dato.length - 1];
        
        // recorrer el array para encontrar el mayor y menor
        for (int i = 1; i < dato.length; i++) {
            // comparar el dato actual con el mayor
            if (dato[i] > mayor) {
                mayor = dato[i];
            }
            
            // comparar el dato actual con el menor
            if (dato[i] < menor) {
                menor = dato[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio + "\nEl valor mayor es: " + mayor + "\n El valor menor es: " + menor);
        
        // iniciar el contador en 0
        cantidadesMayoresA100 = 0;
        // recorrer el array 
        for (int i = 0; i< dato.length; i++) {
            // verificar si el dato actual cumple la condicion.
            if (dato[i] > 100) {
                // incrementar el contador
                cantidadesMayoresA100++;
            }
        }
    }
}