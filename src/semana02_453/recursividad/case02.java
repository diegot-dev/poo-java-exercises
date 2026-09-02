package semana02_453.recursividad;

import java.util.Scanner;

public class case02 {
    static Scanner s = new Scanner(System.in);
    public static double totalSales(int days, double spd)
    {
        if (days == 1) return spd;
        double newSpd = s.nextDouble();
        return spd + totalSales(--days, newSpd);
    }

    public static void main(String[] args) {
        int days;
        double initialSpd, total;
        System.out.print("Ingrese dias: ");
        days = s.nextInt();
        System.out.print("Monto dia 1: ");
        initialSpd = s.nextDouble();
        total = totalSales(days, initialSpd);
        System.out.println("El monto total acumulado de ventas es: " + total);
    }
}
