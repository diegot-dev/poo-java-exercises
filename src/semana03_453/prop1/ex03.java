package semana03_453.prop1;

public class ex03 {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {5, 10, 15, 20, 25};
        for (int i = 0; i < 5; i++) {
            sum += nums[i];
        }
        System.out.println("Suma: " + sum);
    }
}
