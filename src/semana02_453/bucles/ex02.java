package semana02_453.bucles;

public class ex02 {
    public static void main(String[] args)
    {
        int sum = 0, num = 160;
        for (int i = 0; i < 15; i++) {
            sum += num;
            num -= 4;
            System.out.printf("(%d) %d\n", i+1, num);
        }
        System.out.println("La suma de la serie es: " + sum);
    }
}
