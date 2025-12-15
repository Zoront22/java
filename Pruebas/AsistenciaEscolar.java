import javax.swing.JOptionPane;

public class AsistenciaEscolar {
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        int[][] asistencias = new int[5][5];
        int salones = 10;
        int diasTotales = 5;
        int totalAsistencias = 0;
        int menorAsistencia, diaMenorAsistencia;

        // pedir asistencia para cada salón y día
        for (int i = 0; i < salones; i++) {
            for (int j = 0; j < diasTotales; j++) {
                int asistencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la asistencia del salón " + (i+1) + " el día " + dias[j] + ":"));
                asistencias[i][j] = asistencia;
            }
        }

        // calcular total de asistencias y encontrar el día con menor asistencia
        menorAsistencia = Integer.MAX_VALUE;
        diaMenorAsistencia = 0;

        for (int j = 0; j < diasTotales; j++) {
            int sumaDia = 0;
            for (int i = 0; i < salones; i++) {
                sumaDia += asistencias[i][j];
            }
            totalAsistencias += sumaDia;

            if (sumaDia < menorAsistencia) {
                menorAsistencia = sumaDia;
                diaMenorAsistencia = j;
            }
        }

        // mostrar resultados
        JOptionPane.showMessageDialog(null, "El total de asistencias en la semana es: " + totalAsistencias);
        JOptionPane.showMessageDialog(null, "El día con menor asistencia es: " + dias[diaMenorAsistencia] + " con " + menorAsistencia + " asistencias.");
    }
}
