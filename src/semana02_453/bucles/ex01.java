package semana02_453.bucles;

public class ex01 {
    public static void main(String[] args) {
        int num = 3, sum = 0;
        for (int i = 0; i < 20; i++){
            sum += num;
            System.out.printf("(%d) %d\n", i+1, num);
            num += 6;
        }
        System.out.println("La suma de la serie es: " + sum);
    }
}
