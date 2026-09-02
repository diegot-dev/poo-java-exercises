package semana02_453.recursividad;

import java.util.Scanner;

public class ex01 {
    public static double pow(double base, int exp)
    {
        // Invierte el signo del exponente e invierte la base
        if (exp < 0) {
            exp *= -1;
            base = 1/base;
        }

        if (base == 0 && exp == 0) return 0;
        if (exp == 1) return base;
        return base * pow(base,--exp);
    }
    public static void main(String[] args)
    {
        double power;
        int base, exp;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese los datos para calcular la potencia");
        System.out.println("Base: ");
        base = s.nextInt();
        System.out.println("Exponente: ");
        exp = s.nextInt();
        s.close();

        power = pow(base, exp);
        System.out.printf("%d ^ %d = %.2f", base,exp,power);
    }
}
