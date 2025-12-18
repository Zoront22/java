// Un maestro tiene un grupo de N alumnos que califica con valores de 5 a 10 , elabore un
// programa que le permita saber cuántos alumnos obtuvieron cada calificación.

import javax.swing.JOptionPane;

public class NAlumnos
{
    public static void main(String args[]) {
        int[] calificaciones;
        int alumnos;
        
        do {
            alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos: "));
            calificaciones = new int[alumnos];
            
            if (alumnos <= 0){
                System.out.println("Ingresa un valor mayor a 0");
            }
        } while (alumnos <= 0);
        
        for (int i = 0; i < calificaciones.length; i++) {
            do {
                calificaciones[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion (5-10) del alumno " + (i + 1) + ":"));
                if (calificaciones[i] < 5 || calificaciones[i] > 10) {
                    System.out.println("Ingrese una calificacion del 5 - 10");
                }
            } while (calificaciones[i] < 5 || calificaciones[i] > 10);
        }
        
        JOptionPane.showMessageDialog(null, "La cantidad de alumnos fue: " + alumnos);
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("La calificacion del alumno: " + (i + 1) + " es: " + calificaciones[i]);
        }
    }
}