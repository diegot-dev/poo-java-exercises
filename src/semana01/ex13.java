package semana01;
import java.util.Scanner;

public class ex13 {
    public static String romByDigit(int digit, String unit, String middle, String last)
    {
        switch (digit) {
            case 1: return unit;
            case 2: return unit + unit;
            case 3: return unit + unit + unit;
            case 4: return unit + middle;
            case 5: return middle;
            case 6: return middle + unit;
            case 7: return middle + unit + unit;
            case 8: return middle + unit + unit + unit;
            case 9: return unit + last;
            case 10: return last;
            default: return "";
        }
    }
    public static String toRoman(int dNum) 
    {
        String romDig = "";

        romDig += romByDigit(dNum/1000, "M", "", "");
        romDig += romByDigit((dNum%1000)/100, "C", "D", "M");
        romDig += romByDigit((dNum%100)/10, "X", "L", "C");
        romDig += romByDigit(dNum%10, "I", "V", "X");

        return romDig;
    }

    public static void main(String[] args) {
        int decNumber;
        String romNumber;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        decNumber = s.nextInt();
        romNumber = toRoman(decNumber);
        System.out.println("Su número en romanos es: " + romNumber);
        s.close();               

    }
}
