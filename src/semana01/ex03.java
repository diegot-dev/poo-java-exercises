package semana01;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Calculadora de hipotenusa\nIngrese catetos");
        System.out.print("(1) : ");
        int cat1 = s.nextInt();
        System.out.print("(2) : ");
        int cat2 = s.nextInt();
        s.close();

        double hip = Math.sqrt(cat1*cat1 + cat2*cat2);
        System.out.println("La hipotenusa es: " + hip);

    }
}