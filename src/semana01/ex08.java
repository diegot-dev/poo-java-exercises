package semana01;
import java.util.Scanner;

public class ex08 {
    public static String spaces(int space)
    {
        String space_size = " ";
        for (int i = 0; i < space; i++) {
            space_size += " ";
        }
        return space_size;
    }
    public static int digits(int number)
    {
        int count = 0,res = number;
        do {
            res /= 10;
            count++;
        } while (res != 0);

        return count;
    }
    public static void main(String[] args)
    {
        String txt = "Kilogramos Libras\n";
        Scanner s = new Scanner(System.in);

        int iter,kg = 1;
        final double pounds = 2.2;
        double sum;
        

        System.out.print("Ingrese cantidad de iteraciones: ");
        iter = s.nextInt();
        s.close();
        for (int i = 1; i <= iter; i++) {
            sum = kg * pounds;
            String txtSum = String.format("%.1f", sum);
            txt += kg + spaces(10 - digits(kg)) + txtSum + "\n";
            kg += 2;
        }
        System.out.print(txt);
    }
}
