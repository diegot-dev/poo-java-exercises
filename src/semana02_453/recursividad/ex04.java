package semana02_453.recursividad;

import java.util.Scanner;

public class ex04 {
    static int sum = 0;
    public static void sumDigits(int num)
    {
        if (num == 0) return;
        sum += num%10;
        num /= 10;
        sumDigits(num);
    }
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        num = s.nextInt();
        s.close();
        sumDigits(num);
        System.out.printf("La suma de los digitos del numero %d es %d", num, sum);
    }
}
