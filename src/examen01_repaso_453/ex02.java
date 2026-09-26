package examen01_repaso_453;

import java.util.Scanner;

public class ex02 {

    public static int maxDigit(int num) {
        if (num < 10) return num;

        int last = num%10;
        int rest = maxDigit(num/10);
        if (last >= rest) {
            return last;
        } else return rest;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese 'n': ");
        int n = s.nextInt();
        int maxDigit = maxDigit(n);
        System.out.println(maxDigit);
        s.close();
    }
}
