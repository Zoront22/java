import javax.swing.JOptionPane;

public class AsistenciaCine {
    public static void main(String[] args) {
        int[][][] asistencias = new int[6][4][2];
        int totalAsistencia = 0;
        String inputAdultos;
        String inputNiños;

        // Ingresar datos de asistencia
        for (int i = 0; i < asistencias.length; i++) {
            for (int j = 0; j < asistencias[i].length; j++) {
                inputAdultos = JOptionPane.showInputDialog("Ingrese la cantidad de adultos para la función " + (j + 1) + " del día " + (i + 1) + ":");
                asistencias[i][j][0] = Integer.parseInt(inputAdultos);

                inputNiños = JOptionPane.showInputDialog("Ingrese la cantidad de niños para la función " + (j + 1) + " del día " + (i + 1) + ":");
                asistencias[i][j][1] = Integer.parseInt(inputNiños);
            }
        }

        // Calcular total de asistencia
        for (int i = 0; i < asistencias.length; i++) {
            for (int j = 0; j < asistencias[i].length; j++) {
                totalAsistencia += asistencias[i][j][0];
                totalAsistencia += asistencias[i][j][1];
            }
        }

        JOptionPane.showMessageDialog(null, "El total de asistencias es: " + totalAsistencia + "personas.");
    }
}
