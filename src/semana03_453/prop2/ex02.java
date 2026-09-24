package semana03_453.prop2;

import java.util.Scanner;

/* Estado: concluido */

public class ex02 {
    
    public static int sizeArr(double[] arr)
    {
        return arr.length;
    }
    
    public static double getByPos(double[] arr, int pos)
    {
        return arr[pos-1];
    }

    public static double avgArr(double[] arr)
    {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        return sum/arr.length;
    }

    public static double maxArr(double[] arr)
    {
        double max = arr[0];
        for (double num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static double minArr(double[] arr)
    {
        double min = arr[0];
        for (double num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int overAvg(double[] arr, double avg)
    {
        int count = 0;
        for (double num : arr) {
            if (num >= avg) count++;
        }
        return count;
    }

    public static int belowAvg(double[] arr, double avg)
    {
        int count = 0;
        for (double num : arr) {
            if (num < avg) count++;
        }
        return count;
    }

    public static void printData(double[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) : %.2f\n", i, arr[i]);
        }
    }

    public static void main(String[] args) {
        double[] salary = {2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7};
        Scanner s = new Scanner(System.in);

        int size = sizeArr(salary);
        double avg = avgArr(salary);
        int overAvg = overAvg(salary, avg);
        int belowAvg = belowAvg(salary,avg);
        double maxSalary = maxArr(salary);
        double minSalary = minArr(salary);
        
        System.out.print("Ingrese la posición: ");
        int pos = s.nextInt();
        double getPos = getByPos(salary, pos);
        s.close();
        
        System.out.println("Tamaño del array: " + size);
        System.out.printf("Sueldo en la posición %d: %.2f\n",pos,getPos);
        System.out.println("Promedio de salarios: " + avg);
        System.out.println("Salarios por encima del promedio: " + overAvg);
        System.out.println("Salarios por debajo del promedio: " + belowAvg);
        System.out.println("Mayor salario " + maxSalary);
        System.out.println("Menor salario " + minSalary);
        printData(salary);
    }
}
