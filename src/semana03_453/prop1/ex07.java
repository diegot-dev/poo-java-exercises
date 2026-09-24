package semana03_453.prop1;

import java.util.Scanner;

public class ex07 {
    
    public static double[] inputIntsArr(Scanner s, double[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static double sumArr(double[] arr)
    {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        return sum;
    }

    public static double avgArr(double[] arr)
    {
        return sumArr(arr)/arr.length;
    }
    public static void main(String[] args) {
        double sum, avg;
        double[] grades = new double[5];
        Scanner s = new Scanner(System.in);
        
        grades = inputIntsArr(s, grades);
        sum = sumArr(grades);
        avg = avgArr(grades);
        System.out.println("Suma: " + sum);
        System.out.println("Promedio: " + avg);
        s.close();
    }
}
