package semana04_453;

public class ex02 {
    public static void showMatrix(int[][] mtx) {
        System.out.printf("Matriz %dx%d\n", mtx.length,mtx[0].length);
        for (int[] arr : mtx) {
            System.out.print("[");
            int len = arr.length;
            for (int elem : arr) {
                if (elem == arr[len - 1]) {
                    System.out.print(elem + "]\n");
                    break;
                }
                System.out.print(elem + ", ");
            }
        }
    }

    public static double mtxAvg(int[][] mtx) {
        double sum = 0;
        double numElem = 0;
        for (int[] arr : mtx) {
            numElem += arr.length;
            for (int elem : arr) {
                sum += elem;
            }
        }
        return sum/numElem;
    }

    public static void main(String[] args) {
        int[][] ages = {{12, 15, 18}, {20, 60, 72}, {23, 55, 35}};
        showMatrix(ages);
        double avg = mtxAvg(ages);
        System.out.printf("Promedio de la matriz: %.3f", avg);
    }
}
