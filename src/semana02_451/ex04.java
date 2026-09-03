package semana02_451;
import java.util.Scanner;


public class ex04 {
    public static void imprimirMenu()
    {
        System.out.println("MENU");
        System.out.println("[1] Evaluar si es capicua");
        System.out.println("[2] Evaluar si es primo");
    }
    
    public static int determinaCapicua(int num)
    {
        int invNum = 0, digit = 0, number = num;
        while (number > 0) {
            digit = number%10;
            invNum = invNum*10 + digit;
            number/=10;
        }
        System.out.println(invNum);
        if (num == invNum) return 1;
        return 0;
    }
    
    public static int determinaPrimo(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) return 0;
        }
        return 1;
    }

    public static int pedirNumero(Scanner s)
    {
        int num;
        while (true) {
            System.out.print("Ingrese numero: ");
            num = s.nextInt();
            if (num >= 0) {
                return num;
            }
            System.out.println("Número invalido..."); 
        }
    }
    
    public static void main(String[] args) {
        int num,opt,res;
        Scanner s = new Scanner(System.in);
        num = pedirNumero(s);
        imprimirMenu();
        while (true) {
            opt = s.nextInt();
            if (opt == 1 || opt == 2) break;
            System.out.println("Número invalido");
        }
        // El profe es cabro y me encanta la verga
        s.close();
        switch (opt) {
            case 1:
                res = determinaCapicua(num);
                if(res==1) {
                    System.out.println("El número es capicua");
                } else System.out.println("El número no es capicua");
                break;
            case 2:
                res = determinaPrimo(num);
                if(res==1) {
                    System.out.println("El número es primo");
                } else System.out.println("El número no es primo");
                
                break;
            default:
                break;
        }
    }
}
