package semana03_453.prop2;
/* Estado: concluido */
public class ex10 {
    public static int[] delRepeated(int[] arr) {
        int last = arr.length;
        boolean isUnique;
        int countUniq = 0;
        int[] uniques = new int[last];

        for (int i = 0; i < last; i++) {
            isUnique = true;
            for (int j = 0; j < countUniq; j++) {
                if (arr[i] == uniques[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniques[countUniq] = arr[i];
                countUniq++;
            }
        }
        /* Creando un array con solo esos elementos */
        int[] uniqueFinal = new int[countUniq];
        for (int i = 0; i < countUniq; i++) {
            uniqueFinal[i] = uniques[i];
        }
        return uniqueFinal;
    }

    public static void main(String[] args) {
        int[] nums = {5,5,5,5,5,5,5,4,5,5,5,2,5,5,3};
        int[] notRep = delRepeated(nums);
        for(int elem : notRep) System.out.println(elem);
    }
}
