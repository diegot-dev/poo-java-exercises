package semana02_453.recursividad;

import java.util.Scanner;

public class case03 {
    public static int intInput(String txt, Scanner s)
    {
        int num;
        System.out.print(txt + ": ");
        num = s.nextInt();
        return num;
    }

    public static int totalAmount(int currTotal, Scanner s)
    {
        int price, quantity, totalAmount = currTotal;
        price = intInput("Ingrese precio unitario del producto", s);
        if (price == -1) return totalAmount;
        quantity = intInput("Ingrese cantidad de productos", s);
        totalAmount = currTotal + price * quantity;
        return totalAmount(totalAmount, s);
    }

    public static void main(String[] args)
    {
        System.out.println("CALCULADOR DE MONTO TOTAL");
        System.out.println("Ingrese '-1' para terminar");
        Scanner s = new Scanner(System.in);
        int num = totalAmount(0, s);
        System.out.println("Resultado: " + num);
        s.close();
    }
}