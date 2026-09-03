package semana02_451;
import java.util.Scanner;
public class ex07 {
    public static int F(int num)
    {
        if (num == 0) return 4;
        return 16 + F(num - 1);
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
        int num, res;
        Scanner s = new Scanner(System.in);
        num = askNumber(s);
        res = F(num);
        System.out.printf("F(%d) = %d", num, res);
    }
}
