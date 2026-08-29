package semana01;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args)
    {
        int max,min,current;
        Scanner s = new Scanner(System.in);
        max = s.nextInt();
        min = max;
        for(int i = 0; i < 4; i++){
            current = s.nextInt();
            if (current >= max) {
                max = current;
            }
            if (current <= min) {
                min = current;
            }
        }
        s.close(); 
        
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
    }
}
