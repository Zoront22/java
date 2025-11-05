import javax.swing.JOptionPane;

public class Arreglos {
    public static void main(String[] args) {
        double[] dato;
        int cantidad;
        double suma = 0, promedio;
        double mayor, menor;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos a capturar:"));
        dato = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            dato[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dato " + (i + 1) + ":"));
            suma += dato[i];
        }

        promedio = suma / cantidad;
        mayor = dato[0];
        menor = dato[0];

        for (int i = 1; i < cantidad; i++) {
            if (dato[i] > mayor) {
                mayor = dato[i];
            }
            if (dato[i] < menor) {
                menor = dato[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio +
                "\nEl valor mayor es: " + mayor +
                "\nEl valor menor es: " + menor);
    }
}
