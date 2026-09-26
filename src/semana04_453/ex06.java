package semana04_453;

import java.util.Scanner;

public class ex06 {

    public static int randint(int min, int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }

    public static void randomCompleteMtx(int[][] mtx, int min, int max) {
        int nRows = mtx.length;
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                mtx[i][j] = randint(min, max);
            }
        }
    }

    public static void showMatrix(int[][] mtx) {
        int nRows = mtx.length;
        System.out.printf("\nMatriz %dx%d\n", nRows, nRows);
        for (int i = 0; i < nRows; i++) {
            System.out.print("[");
            for (int j = 0; j < nRows; j++) {
                int currValue = mtx[i][j];
                if (j == nRows - 1) {
                    System.out.print(currValue + "]\n");
                    break;
                }
                System.out.print(currValue + ", ");
            }
        }
    }

    public static void main(String[] args) {
        final int min = 1;
        final int max = 10000;
        int reps = 1;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese 'n' para la matriz n x n : ");
        int n = s.nextInt();
        s.close();

        int[][] salary = new int[n][n];
        
        for (int i = 0; i < reps; i++) {
            if (reps != 1) System.out.println("\n - Repeticion " + (i+1));
            randomCompleteMtx(salary, min, max);
            showMatrix(salary);
        }

    }
}
