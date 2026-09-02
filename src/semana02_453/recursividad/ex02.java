package semana02_453.recursividad;
import java.util.Scanner;

public class ex02 {

    static int count = 0;
    public static void contarDigitos(int num)
    {
        count++;
        if (num/10 == 0) return;
        contarDigitos(num/10);
    }
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        num = s.nextInt();
        s.close();
        contarDigitos(num);
        System.out.printf("La cantidad de digitos del numero %d es %d", num, count);
    }
}
