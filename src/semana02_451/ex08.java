package semana02_451;
import java.util.Scanner;

public class ex08 {
    public static int sumaPares(int num)
    {
        int digit, sumEven = 0;
        if (num == 0) return 0;
        while (num != 0) {
            digit = num%10;
            if (digit % 2 == 0) sumEven += digit;
            num /= 10;
        }
        return sumEven;
    }

    public static int askNumber(Scanner s)
    {
        int num;
        while (true) {
            System.out.print("Ingrese numero: ");
            num = s.nextInt();
            if (num >= 0) break;
            System.out.println("Numero invalido");
        }
        return num;
    }

    public static void main(String[] args)
    {
        int num, output;
        Scanner s = new Scanner(System.in);
        num = askNumber(s);
        output = sumaPares(num);
        System.out.printf("La suma de los digitos pares de %d es: %d", num, output);
    } 
}
