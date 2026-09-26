package semana04_453;

import java.util.Scanner;

public class ex08 {

    public static int randint(int min, int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }

    public static void completeMtx(int[][] mtx, int min, int max) {
        
        int rows = mtx.length;
        int cols = mtx[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mtx[i][j] = randint(min, max);
            }
        }
    }

    public static void showMtx(int[][] mtx) {
        
        int rows = mtx.length;
        int cols = mtx[0].length;
        System.out.printf("\nMatriz de %dx%d\n", rows, cols);
        
        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < cols; j++) {
                int currValue = mtx[i][j];
                if (j == cols - 1) {
                    System.out.print(currValue + "]\n");
                    break;
                }
                System.out.print(currValue + ", ");
            }
        }
    }

    public static int[] findMax(int[][] mtx) {
        int[] data = {mtx[0][0], 0, 0};
        int rows = mtx.length;
        int cols = mtx[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currValue = mtx[i][j];
                if (currValue > data[0]) {
                    data[0] = currValue;
                    data[1] = i;
                    data[2] = j;
                }
            }
        }
        return data;
    }
    
    public static void main(String[] args) {
        
        final int min = 1;
        final int max = 1000;

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese cantidad de filas: ");
        int rows = s.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int cols = s.nextInt();
        s.close();

        int[][] mtx = new int[rows][cols];
        completeMtx(mtx, min, max);
        int[] maxPos = findMax(mtx);

        System.out.println("Mayor: " + (maxPos[0]));
        System.out.println("Fila del mayor: " + (maxPos[1]+1));
        System.out.println("Columna del mayor: " + (maxPos[2]+1));

        showMtx(mtx);
    }

}
