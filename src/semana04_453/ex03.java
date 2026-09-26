package semana04_453;

import java.util.Scanner;

public class ex03 {
    public static void showMatrix(int[][] mtx) {
        for (int[] arr : mtx) {
            System.out.print("[");
            int len = arr.length;
            for (int elem : arr) {
                if (elem == arr[len-1]) {
                    System.out.print(elem + "]\n");
                    break;
                }
                System.out.print(elem + ", ");
            }
        } 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Ingrese n: ");
        int n = s.nextInt();
        int[][] multTable = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                multTable[i][j] = (i+1)*(j+1);
            }
        }
        s.close();
        showMatrix(multTable);
    }
}
