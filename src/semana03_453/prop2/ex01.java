package semana03_453.prop2;

public class ex01 {

    public static void print(String str)
    {
        System.out.println(str);
    }

    public static void showArrValues(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Edad[%d] : %d\n", (i+1), arr[i]);
        }
    }

    public static int size(int[] arr) {
        return arr.length;
    }

    public static int getByPos(int[] arr, int pos)
    {
        return arr[pos];
    }

    public static int sumArr(int[] arr)
    {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static float avgAge(int[] arr)
    {
        return sumArr(arr)/size(arr);   
    }

    public static int maxAge(int[] arr)
    {
        int maxAge = arr[0];
        for (int age : arr) {
            if (age > maxAge) maxAge = age;
        }
        return maxAge;
    }

    public static int minAge(int[] arr)
    {
        int minAge = arr[0];
        for (int age : arr) {
            if (age < minAge) minAge = age;
        }
        return minAge;
    }

    public static int amountOfAge(int[] arr)
    {
        int count = 0;
        for (int age : arr) {
            if (age >= 18) count++;
        }
        return count;
    }

    public static int amountUnderage(int[] arr)
    {
        int count = 0;
        for (int age : arr) {
            if (age < 18) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] age = {27, 22, 13, 12, 25, 11 ,29, 70, 15, 21};
        print("Tamano del array: " + size(age));
        print("Posicion 5 del array: " + getByPos(age, 5));
        print("Edad Promedio: " + avgAge(age));
        print("Edad del mayor: " + maxAge(age));
        print("Edad del menor: " + minAge(age));
        print("Cantidad de mayores de edad: " + amountOfAge(age));
        print("Cantidad de menores de edad: " + amountUnderage(age));
        showArrValues(age);

    }
}
