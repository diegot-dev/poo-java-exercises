package semana03_453.prop2;
/* Estado: concluido */
import java.util.Scanner;

public class ex06 {

    public static int askValue(Scanner s, int limit)
    {
        int num;
        while (true) {
            System.out.printf("Ingrese un numero del 0 al %d : ",limit);
            num = s.nextInt();
            if (0 <= num && num <= limit) return num-1;
            System.out.println("Número inválido");
        }
    }

    public static int askValue(Scanner s, int init, int limit)
    {
        int num;
        while (true) {
            System.out.printf("Ingrese número del %d al %d : ", init, limit);
            num = s.nextInt();
            if (init <= num && num <= limit) return num-1;
            System.out.println("Número inválido");
        }
    }

    public static void printArray(int[] array)
    {
        String arrString = "[";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - 1]) {
                arrString += array[i] + "]";
                break;
            }
            arrString += array[i] + ", ";
        }
        System.out.println(arrString);
    }

    public static void main(String[] args) {

        final int limit = 5;
        int[] array = {1,92,1902,3,5};
        int i, j, temp;
        Scanner s = new Scanner(System.in);
        
        printArray(array);
        System.out.print("Ingrese el valor i: ");
        i = askValue(s, limit);
        System.out.print("Ingrese el valor j: ");
        j = askValue(s, limit);
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        printArray(array);
    }
}
