package semana04_453;

import java.util.Scanner;

public class ex04 {
    
    public static void showMtx(int[][] mtx) {
        int numRows = mtx.length;
        System.out.println("\nMatriz dada: ");
        for (int i = 0; i < numRows; i++) {
            int numCols = mtx[i].length;
            System.out.print("[");
            for (int j = 0; j < numCols; j++) {
                if (j == numCols - 1) {
                    System.out.print(mtx[i][j] + "]\n");
                    break;
                }
                System.out.print(mtx[i][j] + ", ");
            }
        }
    }

    public static int[] sumRows(int[][] mtx) {
        int[] sumRows = new int[mtx.length];
        int idx = 0;
        for (int[] row : mtx) {
            int sumCurrRow = 0;
            for (int elem : row) sumCurrRow += elem;
            sumRows[idx++] = sumCurrRow;
        }
        return sumRows;
    }

    public static int[] sumCols(int[][] mtx) {
        
        int numRows = mtx.length;
        int numCols = mtx[0].length;

        int[] sumCol = new int[numCols];
        for (int j = 0; j < numCols; j++) {
            int sumCurrRow = 0;
            for (int i = 0; i < numRows; i++) {
                sumCurrRow += mtx[i][j];
            }
            sumCol[j] = sumCurrRow;
        }
        return sumCol;
    }

    public static void showData(String title, String elem, int[] arr) {
        System.out.println(title);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s %d: %d\n", elem, (i+1), arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese 'n' filas: ");
        int n = s.nextInt();
        System.out.print("Ingrese 'm' columnas: ");
        int m = s.nextInt();
        
        int[][] sells = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.printf("\nFila %d:\n",(i+1));
            for (int j = 0; j < m; j++) {
                System.out.printf("Columna %d: ",(j+1));
                sells[i][j] = s.nextInt();
            }
        }
        s.close();
        int[] sumRows = sumRows(sells);
        int[] sumCols = sumCols(sells);
        showMtx(sells);
        showData("\nSuma de filas", "Fila", sumRows);
        showData("\nSuma de columnas", "Columna", sumCols);
    }
}
