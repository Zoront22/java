import java.util.Scanner;

public class NoGordas {
    public static void main(String args[]) {
        int peso = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Cuanto pesas?");
        peso = in.nextInt();

        if (peso < 80) {
            System.out.println("Epico Bv");
        } else if (peso > 80) {
            System.out.println("Gordo");
        }
    }
}