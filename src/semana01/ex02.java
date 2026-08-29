package semana01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese los siguientes datos:");
        
        System.out.print("- Subtotal (S/): ");
        float sub = s.nextFloat();
        
        System.out.print("- Tasa de Gratuidad (%): ");
        float grat = s.nextInt();
        
        grat = sub*grat/100;

        System.out.println("Gratuidad: " + (grat));
        System.out.println("Total: " + (sub+grat));
        s.close();
    }
}
