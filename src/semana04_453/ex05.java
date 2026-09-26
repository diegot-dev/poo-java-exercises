package semana04_453;

import java.util.Scanner;

public class ex05 {
    
    public static void completeMatrix(Scanner s, int[][] mtx) {
        for (int i = 0; i < mtx.length; i++) {
            System.out.printf("Fila %d:\n", (i+1));
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.printf("Columna %d:", (j+1));
                mtx[i][j] = s.nextInt();
            }
        }
    }

    public static int[][] trasposeMtx(int[][] mtx) {
        int nRows = mtx.length;
        int nCols = mtx[0].length;
        int[][] trasposed = new int[nCols][nRows];
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                trasposed[j][i] = mtx[i][j];
            }
        }
        return trasposed;
    }

    public static void showMtx(int[][] mtx) {
        int nRows = mtx.length;
        int nCols = mtx[0].length;
        for (int i = 0; i < nRows; i++) {
            System.out.print("[");
            for (int j = 0; j < nCols; j++) {
                int currVal = mtx[i][j];
                if (j != nCols-1) {
                    System.out.print(currVal + ", ");
                    continue;
                }
                System.out.print(currVal + "]\n");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese filas: ");
        int rows = s.nextInt();
        System.out.print("Ingrese columnas: ");
        int cols = s.nextInt();

        int[][] goals = new int[rows][cols];
        completeMatrix(s, goals);
        
        int[][] trasposedGoals = trasposeMtx(goals);

        System.out.println("Matriz de goles:");
        showMtx(goals);
        System.out.println("Matriz traspuesta de goles:");
        showMtx(trasposedGoals);
        
    }
}
