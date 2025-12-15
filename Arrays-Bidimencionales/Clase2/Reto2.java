
public class Reto2 {
    // Calcular el promedio de temperatura para cada día de la semana utilizando datos de varias estaciones.

    // Se proporciona lo siguiente:

    // Estación 1: {20, 22, 24, 19, 21, 23, 25}
    // Estación 2: {18, 20, 22, 19, 20, 22, 24}
    // Estación 3: {21, 23, 25, 22, 24, 26, 28}
    // Estación 4: {19, 21, 23, 20, 22, 24, 26}

    // Tarea:
    // Escribir un método llamado calculateDailyAverages(int[][] temperatures) que devuelva un double[].
    // En este método:
    // Recorrer cada día (columnas del array bidimensional).
    // Para cada día, inicializar totalTemp para almacenar la suma de temperaturas.
    // Utilizar un bucle interno para recorrer todas las estaciones (filas).
    // Sumar las temperaturas de cada estación para el día actual.
    // Dividir el total entre el número de estaciones para obtener el promedio.
    // Almacenar el resultado en un array.
    // Devolver el array de promedios.

    public static double[] calculateDailyAverages(int[][] temperatures) {
        int days = temperatures[0].length;
        int stations = temperatures.length;
        double[] dailyAverages = new double[days];

        // leemos los dias (columnas) con j
        for (int j = 0; j < days; j++) {
            int totalTemp = 0;

            // leemos las estaciones (filas) con i
            for (int i = 0; i < stations; i++) {
                totalTemp += temperatures[j][i];
            }
            dailyAverages[j] = (double) totalTemp / stations;
        }

        return dailyAverages;
    }

    public static void main(String[] args) {
        int[][] temperatures = {
                {20, 22, 24, 19, 21, 23, 25},
                {18, 20, 22, 19, 20, 22, 24},
                {21, 23, 25, 22, 24, 26, 28},
                {19, 21, 23, 20, 22, 24, 26}
        };

        double[] averages = calculateDailyAverages(temperatures);
        for (int day = 0; day < averages.length; day++) {
            System.out.println("Average temperature on day " + (day + 1) + ": " + averages[day]);
        }
    }
}
