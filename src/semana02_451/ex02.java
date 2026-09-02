package semana02_451;
import java.util.Scanner;

public class ex02 {
    public static int contarDigitos(int num)
    {
        int count = 0;
        
        if (num == 0) return 1;
        while (num != 0) {
            num /= 10;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num, cantDigitos;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        num = s.nextInt();
        s.close();
        
        cantDigitos = contarDigitos(num);
        System.out.printf("La cantidad de digitos del numero %d es %d", num, cantDigitos);
    }
}
