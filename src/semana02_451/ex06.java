package semana02_451;
import java.util.Scanner;
public class ex06 {
    public static double sumaSerie(int num)
    {
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += 1.0/i;
        }
        return sum;
    }

    public static int pedirNumero(Scanner s)
    {
        System.out.print("Ingrese número: ");
        int inpNum;
        while (true) {
            inpNum = s.nextInt();
            if (inpNum > 0) break;
            System.out.println("Número ingresado inválido");
        }
        return inpNum;
    }

    public static void main(String[] args)
    {
        int num;
        double sum;
        Scanner s = new Scanner(System.in);
        
        num = pedirNumero(s);
        sum = sumaSerie(num);
        System.out.printf("Seria armónica de 1 a %d: %d",num,sum);
    }
}
