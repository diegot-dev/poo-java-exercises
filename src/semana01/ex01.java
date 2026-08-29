package semana01;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese medida en pies: ");
        float ft = s.nextFloat();
        System.out.println(ft + " pies en metros: " + (ft*0.305) + " m");
        s.close();
        
    }
}
