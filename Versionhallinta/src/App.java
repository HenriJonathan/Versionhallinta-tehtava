import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        System.out.println("Arvo numero.");
        in.nextLine();

        numero1 = random.nextInt(10) +1;
        System.out.println(numero1);

        numero2 = random.nextInt(10) +1;
        System.out.println(numero2);

        numero3 = random.nextInt(10) +1;
        System.out.println(numero3);


    }
}
