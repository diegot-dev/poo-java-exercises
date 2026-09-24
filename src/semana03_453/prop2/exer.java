package semana03_453.prop2;

public class exer {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        return (sum(arr)/arr.length);
    }


    public static int overAvg(int[] arr, double avg) {
        int count = 0;
        for (int elem : arr) {
            if (elem > avg) count++;
        }
        return count;
    }

    public static int belowAvg(int[] arr, double avg) {
        int count = 0;
        for (int elem : arr) {
            if (elem < avg) count++;
        }
        return count;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int elem : arr) {
            if(elem > max) max = elem;
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int elem : arr) {
            if(elem < min) min = elem;
        }
        return min;
    }

    public static String goodPer(int[] arr, int overAvg) {
        float per = (float)(overAvg)/(float)arr.length * 100;
        return String.format("%.2f%%", per);
    }

    public static void main(String[] args) {
        int[] sells = {850, 1200, 950, 1500, 780, 1100, 1350, 920, 1600, 1250, 890, 1450, 1050, 1700, 980};

        double avgSell = avg(sells);
        int maxSell = max(sells);
        int minSell = min(sells);

        int overAvgSells = overAvg(sells, avgSell);
        int belowAvgSells = belowAvg(sells, avgSell);
        String percentOver = goodPer(sells, overAvgSells);

        System.out.println("Venta maxima: " + maxSell);
        System.out.println("Venta minima: " + minSell);
        System.out.println("Promedio de ventas: " + avgSell);
        System.out.println("Ventas por encima del promedio: " + overAvgSells);
        System.out.println("Ventas por debajo del promedio: " + belowAvgSells);
        System.out.println("Porcentaje de dias con buenas ventas: " + percentOver);
        
    }
}
