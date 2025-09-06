public class Clase4 {
  public static void main(String args[]){
    
    int matemáticas = 9;
    int biología = 8;
    int química = 7;
    int promedio = 0;

    promedio = (matemáticas + biología + química) / 3;
    
    if (promedio >= 7) {
      System.out.println("Aprovado");
   }
    else {
      System.out.println("Reprobado");
   }
 }
}