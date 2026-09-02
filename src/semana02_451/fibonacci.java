package semana02_451;

public class fibonacci {
    public static long recFibo(int num) {
        if (num == 1) return 1;
        if (num == 2) return 1;
        return recFibo(num - 1) + recFibo(num - 2);
    }
    public static void main(String[] args) {
        System.out.println(recFibo(9));
    }
}
