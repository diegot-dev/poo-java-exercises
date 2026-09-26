package semana04_453;

import java.util.Scanner;

public class ex01 {
    public static void showMatrix(int[][] mtx) {
        for(int[] arr : mtx) {
            System.out.print("[");
            for (int elem : arr) {
                if (elem != arr[arr.length - 1]) {
                    System.out.print(elem + ",");
                    continue;
                }
                System.out.println(elem + "]\n");
            }
        }
    }
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de filas: ");
        int rows = s.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int columns = s.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;
            }
        }
        s.close();
        showMatrix(matrix);
    }
}
