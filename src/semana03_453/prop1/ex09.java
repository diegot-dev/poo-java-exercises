package semana03_453.prop1;
import java.util.Scanner;

public class ex09 {
    public static int[] array(Scanner s)
    {
        System.out.print("Ingrese tamaño del array: ");
        int size = s.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("(%d) : ", (i+1));
            nums[i] = s.nextInt();
        }

        return nums;
    }

    public static int searchPos(int[] arr, int target)
    {
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return pos = i;
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pos, target;
        int[] nums = array(s);
        

        System.out.print("Ingrese numero a buscar: ");
        target = s.nextInt();
        pos = searchPos(nums, target);
        if (pos == -1) System.out.println("No se ha encontrado el número");
        else System.out.println("Número encontrado, su posición es: " + pos);

    }
}
