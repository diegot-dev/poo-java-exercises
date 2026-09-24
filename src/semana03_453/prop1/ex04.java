package semana03_453.prop1;

public class ex04 {
    public static void main(String[] args) {
        int[] nums = {18, 7, 35, 12, 29};
        int max = nums[0];
        for (int i = 1; i < 5; i++) {
            if (max <= nums[i]) max = nums[i];
        }
        System.out.println("Mayor: " + max);
    }
}
