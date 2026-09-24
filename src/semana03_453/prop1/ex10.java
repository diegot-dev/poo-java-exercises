package semana03_453.prop1;

import java.util.Scanner;

public class ex10 {
    
    public static int[] array(Scanner s)
    {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) : ", i);
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void showData(int[] arr)
    {
        System.out.println("\n Mostrando datos...");
        int count = 1;
        for (int num : arr) {
            System.out.printf("(%d) : %d\n", count++, num);
        }
    }

    public static double avgArr(int[] arr)
    {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double)sum/arr.length;
    }

    public static int minArr(int[] arr)
    {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int maxArr(int[] arr)
    {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] temp = array(s);
        int min, max;
        double avg;

        min = minArr(temp);
        max = maxArr(temp);
        avg = avgArr(temp);

        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Promedio: " + avg);
        showData(temp);
        
    }
}
