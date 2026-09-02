package semana02_453.recursividad;
import java.util.Scanner;

public class case01 {
    static int spv = 20;
    static int count = 0;

    public static void calculateTarget(int target) 
    {
        if (target <= 0) return;
        count++;
        calculateTarget(target-spv);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int target;

        System.out.print("Ingrese meta: ");
        target = s.nextInt();
        calculateTarget(target);
        System.out.println("La meta es: " + count);
        s.close();
    }
}
