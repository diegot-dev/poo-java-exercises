package semana02_453.recursividad;
import java.util.Scanner;

public class ex03 {
    public static long recFactorial(int num) {
        if (num == 0) return 1;
        return num*recFactorial(num-1);
    }

    public static void main(String[] args) {
        int num;
        long fact;
        System.out.println("FACTORIAL RECURSIVO");
        Scanner s = new Scanner(System.in);
        System.out.print("Número: ");
        num = s.nextInt();
        s.close();
        
        fact = recFactorial(num);
        System.out.println("Resultado: " + fact);
    }
}