package semana03_453.prop2;

import java.util.Scanner;

/* Estado: Concluido */

public class ex05 {

    public static void putData(Scanner s,int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) : ", (i+1));
            arr[i] = s.nextInt();
        }
    }

    public static void printArr(String arrName, int[] arr)
    {
        System.out.println("Imprimiento información del array \"" + arrName + "\"");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) : %d\n", i,arr[i]);
        }
    }

    public static void main(String[] args)
    {
        final int size = 5;

        int[] A = new int[size];
        int[] B = new int[size];
        int[] C = new int[size];
        int currMax;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese los datos de A:");
        putData(s, A);
        System.out.println("Ingrese los datos de B:");
        putData(s, B);
        s.close();
        
        for (int i = 0; i < size; i++) {
            currMax = A[i];
            if (A[i] <= B[i]) currMax = B[i];
            C[i] = currMax;
        }
        printArr("C", C);
    }
}
