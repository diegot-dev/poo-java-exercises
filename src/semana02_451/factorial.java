package semana02_451;

import java.util.Scanner;

public class factorial {
    public static long recFactorial(int num) {
        if (num == 0) return 1;
        return num*recFactorial(num-1);
    }

    public static long bucFactorial(int num) {
        long acc = 1;
        if (num == 0) return acc;

        while (num != 0) {
            acc *= num;
            num--;
        }

        return acc;
    }

    public static void main(String[] args) {
        int num;
        long fact;
        System.out.println("FACTORIAL RECURSIVO");
        Scanner s = new Scanner(System.in);
        System.out.print("Número: ");
        num = s.nextInt();
        fact = recFactorial(num);
        System.out.println("Resultado: " + fact);
        
        System.out.println("\nFACTORIAL CON BUCLES");
        System.out.print("Número: ");
        num = s.nextInt();
        fact = bucFactorial(num);
        System.out.println("Resultado: " + fact);
        s.close();
    }
}
