package semana03_453.prop2;
import java.util.Scanner;
/* Estado: concluido */
public class ex04 {


    public static double avg(double[] arr)
    {
        double sum = 0.0;
        for (double elem : arr) {
            sum += elem;
        }
        return sum/arr.length;
    }

    public static int numPosMax(double[] arr)
    {
        int maxPos = 0;
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPos = i;
            }
        }

        return maxPos + 1;
    }

    public static int numPosMin(double[] arr)
    {
        int minPos = 0;
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPos = i;
            }
        }

        return minPos + 1;
    }

    public static void putData(double[] arr, Scanner s)
    {
        System.out.printf("Ingrese %d valores", arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\n(%d) : ", i+1);
            arr[i] = s.nextDouble();
        }
    }

    public static void main(String[] args)
    {
        final int days = 12;
        
        Scanner s = new Scanner(System.in);
        double avgRain;
        int dayMinRain, dayMaxRain; 
        double[] rainMm = new double[days];
        putData(rainMm, s);

        avgRain = avg(rainMm);
        dayMaxRain = numPosMax(rainMm);
        dayMinRain = numPosMin(rainMm);

        System.out.printf("Promedio de lluvia diaria del mes: %.2f\n",avgRain);
        System.out.println("Día con mayor lluvia: " + dayMaxRain);
        System.out.println("Día con menor lluvia: " + dayMinRain);
    }
}
