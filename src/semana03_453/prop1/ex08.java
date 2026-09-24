package semana03_453.prop1;

import java.util.Scanner;

public class ex08 {
    
    public static void inputArr(Scanner s, int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) ",(i+1));
            arr[i] = s.nextInt();
        }
    }

    public static int countEven(int[] arr)
    {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[6];
        int even;
        
        inputArr(s, nums);
        even = countEven(nums);
        System.out.println("La cantidad de numeros pares: " + even);
        s.close();
    }
}