package semana01;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        double number, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        double sum = 0, avg;
        short count = 0;
        boolean doCalc = true;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.printf("(%d) : ", count+1);
            number = s.nextDouble();
            if (number < 0) {
                if (count > 0) break;
                System.out.println("No se proporcionaron números");
                doCalc = false;
                break;
            }
            if (number > max) max = number;
            if (number < min) min = number;
            sum += number;
            count ++;
        }

        s.close();

        if (doCalc) {
            avg = sum/count;
            
            System.out.println("Números ingresados: " + count);
            System.out.println("Minimo: " + min);
            System.out.println("Maximo: " + max);
            System.out.println("Suma: " + sum);
            System.out.println("Media aritmetica: " + avg);
        }
    }
}
