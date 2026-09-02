package semana02_451;

import java.util.Scanner;

public class ex01 {
    public static int leerNum()
    {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        s.close();
        if (num >= 0) return num;
        return -1;
    }
    public static void main(String[] args) {
        int num = leerNum();
        System.out.println(num);
    }
}
