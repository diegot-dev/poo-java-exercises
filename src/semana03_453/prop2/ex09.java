package semana03_453.prop2;
/* Estado: concluido */
/* NO acepta 0 como valores en el array inicial, me dio flojera cambiarlo */
public class ex09 {

    public static int randomInt(int min, int max)
    {
        return (int) (Math.random()*(max - min + 1) + min);
    }

    public static int[] randIntArr(int size, int min, int max)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = randomInt(min, max);
        }
        return arr;
    }

    public static int[] excludeRep(int[] arr)
    {
        int repCount = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    repCount++;
                }
            }
        }
        int[] exRep = new int[arr.length-repCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){ 
                exRep[idx] = arr[i];
                idx++;
            }
        }
        return exRep;
    }

    public static void bubbleSort(int[] arr)
    {
        int temp, n = arr.length;
        boolean stop;

        for (int i = 0; i < n - 1; i++) {
            stop = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    stop = false;
                }

            }
            if (stop) break;
        }
    }

    public static String arr2Str(int[] arr)
    {
        String txt = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                txt += arr[i] + "]";
                break;
            }
            txt += arr[i] + ", ";
        }
        return txt;
    }

    public static void main(String[] args)
    {
        final int size = 20;
        int[] numbers = randIntArr(size,1, 20);
        System.out.println("Numeros random");
        System.out.println(arr2Str(numbers));
        int [] excluded = excludeRep(numbers);
        bubbleSort(excluded);
        System.out.println(arr2Str(excluded));
    }
}