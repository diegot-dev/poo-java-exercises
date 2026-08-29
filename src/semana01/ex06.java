package semana01;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String ver = "TODO ÚNICO";
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; i < 5; i++) {
                if (i == j) continue;
                if (numbers[i] == numbers[j]) ver = "DUPLICADO";
            }
        }
        s.close();
        System.out.println(ver);
    }
}
