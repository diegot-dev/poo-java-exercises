package semana01;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = s.nextInt();
        s.close();
        
        if (1 <= num && num <= 100){
            System.out.println("OK");
        } else {
            System.out.println("Fuera de rango");
        }
    }
}
