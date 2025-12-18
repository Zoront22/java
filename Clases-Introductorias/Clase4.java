
public class Clase4 {

    public static void main(String args[]) {

        int matemáticas = 9;
        int biología = 8;
        int química = 7;
        int promedio = 0;

        promedio = (matemáticas + biología + química) / 3;

        // estructura condicional
        // si el promedio es mayor o igual a 7
        if (promedio >= 7) {
            // aprovado
            System.out.println("Aprovado");
        } // sino
        else {
            // reprobado
            System.out.println("Reprobado");
        }
    }
}
