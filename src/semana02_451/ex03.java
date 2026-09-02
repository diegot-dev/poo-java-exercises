package semana02_451;
import java.util.Scanner;

public class ex03 {
    public static int calculaSumaSerie(int infLimit, int supLimit)
    {
        int sumaSupLimit = 0, sumaInfLimit = 0, res;
        for (int i = 1; i < supLimit; i++) {
            sumaSupLimit += i; 
        }
        for (int i = 1; i < infLimit; i++) {
            sumaInfLimit += i; 
        }

        res = sumaSupLimit - sumaInfLimit;
        return res;
    }
    public static void main(String[] args)
    {
        int supLimit, infLimit, res;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese límite inferior: ");
        infLimit = s.nextInt();
        System.out.print("Ingrese límite superior: ");
        supLimit = s.nextInt();
        s.close();
        res = calculaSumaSerie(infLimit, supLimit);
        System.out.println("Suma total: " + res);
    }
}
