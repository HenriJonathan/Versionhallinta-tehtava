import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        int raha = 5;
        int seiskat = 0;

        System.out.println("Arvo numero.");
        in.nextLine();


        while(raha > 0)
        {
        raha = raha - 1;
        seiskat = 0;

        numero1 = random.nextInt(10) +1;
        System.out.println(numero1);

        numero2 = random.nextInt(10) +1;
        System.out.println(numero2);

        numero3 = random.nextInt(10) +1;
        System.out.println(numero3);

           if (numero1 == 7) 
            {
                seiskat++;
            }

            if (numero2 == 7) 
            {
                seiskat++;
            }

            if (numero3 == 7) 
            {
                seiskat++;
            }
            if (seiskat > 0) {
                raha = raha + seiskat + 2;
                System.out.println("Voitit!");
            }
            else {
                System.out.println("Hävisit!");
            }

            System.out.println("Rahaa jäljellä: " + raha);

        if (raha > 0)
        {  
        System.out.println("Paina Enter jatkaaksesi...");
        in.nextLine();
        }  

        }


       
    
    
    
    }


}
