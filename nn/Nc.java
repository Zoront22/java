import java.util.Scanner;

public class Nc {
    public static void main(String[] args) {
        int param = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero 1 a 5 para X:");
        param = in.nextInt();

        switch (param) {
            case 1:
                System.out.println("Es como cuando te enseñan un bebe");
                break;

            case 2:
                System.out.println("Y el bebe llora");
                break;

            case 3:
                System.out.println("Y tu lo calmas");
                break;

            case 4:
                System.out.println("Y el bebe se duerme");
                break;

            case 5:
                System.out.println("Y tu lo amas");
                break;
        }
    }
}
