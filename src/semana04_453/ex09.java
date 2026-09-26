package semana04_453;

import java.util.Scanner;

public class ex09 {

    public static int randint(int min, int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }

    public static void completeRandomMtx(int[][] mtx, int min, int max) {
        
        int rows = mtx.length;
        int cols = mtx[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mtx[i][j] = randint(min, max);
            }
        }
    }

    public static int[] summarize(int[][] mtx) {
        
        int rows = mtx.length;
        int cols = mtx[0].length;
        
        int even = 0, odd = 0;
        int positive = 0, negative = 0;
        int zeros = 0;
        int[] data = new int[5];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int elem = mtx[i][j];

                if (elem % 2 == 0) even++;
                else odd++;
                if (elem > 0) positive++;
                else if (elem < 0) negative++;
                else zeros++;

            }
        }

        data[0] = even;
        data[1] = odd;
        data[2] = positive;
        data[3] = negative;
        data[4] = zeros;

        return data;
    }
    
    public static void showMtx(int[][] mtx) {
        
        int rows = mtx.length;
        int cols = mtx[0].length;

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
    
    public static void println(String txt) {
        System.out.println(txt);
    }

    public static void main(String[] args) {
        
        final int min = -5;
        final int max = 5;

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese numero de filas: ");
        int rows = s.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        int cols = s.nextInt();
        s.close();

        int[][] mtx = new int[rows][cols];
        
        completeRandomMtx(mtx, min, max);

        int[] dataEOPNZ = summarize(mtx);
        showMtx(mtx);
        println("Pares: " + dataEOPNZ[0]);
        println("Impares: " + dataEOPNZ[1]);
        println("Positivos: " + dataEOPNZ[2]);
        println("Negativos: " + dataEOPNZ[3]);
        println("Ceros: " + dataEOPNZ[4]);

    }
}
