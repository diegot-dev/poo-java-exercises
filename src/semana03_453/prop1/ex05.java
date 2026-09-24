package semana03_453.prop1;
import java.util.Scanner;

public class ex05 {
    public static int[] insertData(int[] nums, Scanner s)
    {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("(%d) : ", i+1);
            nums[i] = s.nextInt();
        }
        return nums;
    }
    
    public static int sumArr(int[] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static String stringArr(int[] nums)
    {
        String txt = "[";
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                txt += String.format("%d]",nums[i]);
                break;
            }
            txt += String.format("%d,", nums[i]);
        }
        return txt;

    }

    public static void main(String[] args)
    {
        String strArr;
        int size, sum;
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del array: ");
        size = s.nextInt();
        int[] nums = new int[size];
        nums = insertData(nums, s);
        sum = sumArr(nums);
        strArr = stringArr(nums);
        System.out.println("Array: " + strArr);
        System.out.println("Suma: " + sum);
        s.close();
    }
}
