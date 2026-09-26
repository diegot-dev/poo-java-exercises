package semana04_453;

import java.util.Scanner;

public class ex10 {

    public static int randint(int min, int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }

    public static void completeRandMtx(int[][] mtx, int min, int max) {
        int rows = mtx.length;
        int cols = mtx[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mtx[i][j] = randint(min, max);
            }
        }
    }

    public static double[] avgPerRow(int[][] mtx) {
        
        double cols = mtx[0].length;
        double[] avgPerRow = new double[mtx.length];
        int idx = 0;

        for (int[] row : mtx) {
            double sumRow = 0.0;
            for (int elem : row) sumRow += elem;
            avgPerRow[idx++] = sumRow/cols;
        }
        return avgPerRow;
    }

    public static void showMtx(int[][] mtx) {
        int rows = mtx.length;
        int cols = mtx[0].length;

        System.out.printf("\n - Matriz %dx%d:\n", rows, cols);
        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < cols; j++) {
                int currVal = mtx[i][j];
                if (j == cols - 1) {
                    System.out.print(currVal + "]\n");
                    break;
                }
                System.out.print(currVal + ", ");
            }
        }
    }

    public static void main(String[] args) {

        final int min = 0;
        final int max = 20;

        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de estudiantes: ");
        int students = s.nextInt();
        System.out.print("Ingrese cantidad de notas: ");
        int grades = s.nextInt();
        
        s.close();

        int[][] gradesMtx = new int[students][grades];
        completeRandMtx(gradesMtx, min, max);
        showMtx(gradesMtx);
        double[] avgPerStudent = avgPerRow(gradesMtx);
        for (int i = 0; i < avgPerStudent.length; i++) {
            System.out.printf("Promedio del Estudiante %d: %.2f\n", (i+1), avgPerStudent[i]);
        }
    }   
}
