package semana03_453.prop1;
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("(%d) : ", i+1);
            numbers[i] = s.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("indice %d -> %d\n", i, numbers[i]);
        }
        s.close();
    }
}
