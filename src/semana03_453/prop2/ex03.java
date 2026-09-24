package semana03_453.prop2;

import java.util.Scanner;

/* Estado: Concluido */
public class ex03 {
    public static String[] sellers = new String[10];
    public static int posNull = 0, day = 1;
    public static final int totalDays = 30;
    public static String report = "\n=== Reporte de ventas ===\n";

    public static double[] sells = new double[totalDays];
    
    public static double sumArray(double[] arr)
    {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int setSells(Scanner s)
    {
        double sellAmount;
        System.out.println("Ingrese venta de cada dia: ");
        while (true) {
            if (day == totalDays+1) return 0;
            System.out.printf("(Dia %d) : ", day);
            sellAmount = s.nextDouble();
            if (sellAmount == -1) return day;
            sells[day-1] = sellAmount;
            report += "Dia " + day + ": " + sellAmount + "\n";
            day++;
        }
    }

    public static boolean askSeller(Scanner s)
    {
        if (posNull == 10) {
            System.out.println("No se puede ingresar mas vendedores");
            return false;
        }
        System.out.print("Nombre del vendedor: ");
        String seller = s.next();
        if (seller.equals("-1")) return false;
        
        report += "\nVenderdor: " + seller + "\n";
        
        posNull++;
        return true;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);    
        while (true) {
            if (!askSeller(s)) break;
            day = setSells(s);
            if (day == 0) break;
        }
        System.out.println(report);
        System.out.println("Total de ventas del mes: " + sumArray(sells));
    }
}
