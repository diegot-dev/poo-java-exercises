package semana03_453.prop2;

import java.util.Scanner;

/* Estado: concluido */

public class ex08 {
    
    public static double avg(double[] arr)
    {
        double sum = 0.0;
        for (double elem : arr) {
            sum += elem;
        }
        return sum/arr.length;
    }

    public static void putData(Scanner s, double[] arr)
    {
        System.out.println("Ingrese " + arr.length + " valores: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" (%s)%s: ",
            toMonth(i),
            stringMult(" ", 11 - toMonth(i).length())
        );
            arr[i] = s.nextDouble();
        }
    }

    public static String toMonth(int num) {
        switch (num) {
            case 0: return "Enero";
            case 1: return "Febrero";
            case 2: return "Marzo";
            case 3: return "Abril";
            case 4: return "Mayo";
            case 5: return "Junio";
            case 6: return "Julio";
            case 7: return "Agosto";
            case 8: return "Septiembre";
            case 9: return "Octubre";
            case 10: return "Noviembre";
            case 11: return "Diciembre";
            default: return "";
        }
    }

    public static String stringMult(String str, int num)
    {
        if (num == 0) return "";
        if (num == 1) return str;
        String txt = "";
        for (int i = 0; i < num; i++) {
            txt += str;
        }
        return txt;
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double[] amMonths = new double[12];

        putData(s, amMonths);
        double avg = avg(amMonths);

        /* Porcentaje de meses con ventas bajas */
        int count = 0;
        for (double elem : amMonths) {
            if (elem < 0.5*avg) count++;
        }
        double perBelow = (double)count/12 * 100;
        System.out.printf("Porcentaje de meses con ventas bajas: %.2f%%\n", perBelow);

        /* Meses con ventas altas*/
        System.out.printf("\nMeses con ventas altas ( > %.2f):\n", avg*0.75);
        for (int i = 0; i < 12; i++) {
            if (amMonths[i] > avg*0.75) System.out.printf(" - %s : %.2f\n", toMonth(i), amMonths[i]);
        }
    }
}
