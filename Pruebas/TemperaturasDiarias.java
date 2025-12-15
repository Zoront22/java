import javax.swing.JOptionPane;

public class TemperaturasDiarias {
    public static void main(String[] args) {
        String[] dia = {
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        };
        String[] momentoDelDia = {
                "Mañana", "Tarde", "Noche"
        };
        double[][] temperaturas = new double[7][3];
        double[] promedioSemanalDiario = new double[7];
        double[] promedioSemanalMomento = new double[3];
        double promedioSemanal = 0;
        double totalSemanal, sumaDia, sumaMomento;
        double temperatura = 0;
        boolean datosValidos = false;

        // entrada de datos
        // temperaturas del dia y momento
        for (int i = 0; i < dia.length; i++) {
            JOptionPane.showMessageDialog(null, "Día: " + dia[i]);

            for (int j = 0; j < momentoDelDia.length; j++) {
                datosValidos = false;

                while (!datosValidos) {
                    try {
                        String entrada = JOptionPane.showInputDialog(null,
                                "Ingrese la temperatura del " + dia[i] + " en la " + momentoDelDia[j] + ":");
                        temperaturas[i][j] = Double.parseDouble(entrada);

                        if (entrada == null) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Programa cancelado.");
                            System.exit(0);
                        }

                        temperatura = Double.parseDouble(entrada);
                        temperaturas[i][j] = temperatura;
                        datosValidos = true;

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número válido.");
                        continue;
                    }
                }
            }
        }

        // calcular promedios
        // promedios diarios
        for (int i = 0; i < dia.length; i++) {
            sumaDia = 0;
            for (int j = 0; j < momentoDelDia.length; j++) {
                sumaDia += temperaturas[i][j];
            }
            promedioSemanalDiario[i] = sumaDia / momentoDelDia.length;
        }

        // promedio por momento del día
        for (int j = 0; j < momentoDelDia.length; j++) {
            sumaMomento = 0;
            for (int i = 0; i < dia.length; i++) {
                sumaMomento += temperaturas[i][j];
            }
            promedioSemanalMomento[j] = sumaMomento / dia.length;
        }

        // promedio semanal total
        totalSemanal = 0;
        for (int i = 0; i < dia.length; i++) {
            for (int j = 0; j < momentoDelDia.length; j++) {
                totalSemanal += temperaturas[i][j];
            }
        }

        promedioSemanal = totalSemanal / (dia.length * momentoDelDia.length);

        for (int i = 0; i < dia.length; i++) {
            JOptionPane.showMessageDialog(null, "El promedio de temperatura del " + dia[i] + " es: " + promedioSemanalDiario[i]);
        }

        for (int j = 0; j < momentoDelDia.length; j++) {
            JOptionPane.showMessageDialog(null, "El promedio de temperatura en la " + momentoDelDia[j] + " es: " + promedioSemanalMomento[j]);
        }
        JOptionPane.showMessageDialog(null, "El promedio semanal total de temperaturas es: " + promedioSemanal);
    }
}