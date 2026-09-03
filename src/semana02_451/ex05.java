package semana02_451;
import java.util.Scanner;
public class ex05 {
    public static long recFibo(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return recFibo(num - 1) + recFibo(num - 2);
    }
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        num = s.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("fibo(%d) => %d\n",i,recFibo(i));
        }
        s.close();
    }
}