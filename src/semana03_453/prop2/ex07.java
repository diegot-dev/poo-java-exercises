package semana03_453.prop2;

import java.util.Scanner;

/* Estado: concluido */

public class ex07 {

    public static void putData(Scanner s, int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) : ", i);
            arr[i] = s.nextInt();
        }
    }

    public static void bubbleSort(int[] arr)
    {
        int temp, n = arr.length;
        boolean stop;

        for (int i = 0; i < n - 1; i++) {
            stop = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    stop = false;
                }

            }
            if (stop) break;
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

    public static int[] evenArray(int[] arr, int size)
    {
        int idx = 0;
        int[] evenArray = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) evenArray[idx++] = arr[i];
        }
        return evenArray;
    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" (%d) : %d\n", i, arr[i]);
        }
    }

    public static void main(String[] args)
    {
        final int size = 12;
        
        int[] numbers = new int[size];
        int[] positiveEvenNums;
        int evenCount;
        float pctEven;
        Scanner s = new Scanner(System.in);
        
        putData(s, numbers);
        
        evenCount = countEven(numbers);
        pctEven = evenCount/(float)size * 100;
        System.out.printf("Porcentaje de pares : %.2f%%\n", pctEven);
        
        positiveEvenNums = evenArray(numbers, evenCount);
        bubbleSort(positiveEvenNums);
        if (positiveEvenNums.length == 0) System.out.println("No hay pares");
        else printArr(positiveEvenNums);
        
    }
}
