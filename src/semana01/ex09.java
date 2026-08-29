package semana01;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args)
    {
        String gender;
        int weight, height, iter;
        int totalH = 0, totalM = 0;
        float sumHeightH = 0, sumWeightH  = 0, sumHeightM = 0, sumWeightM = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese cantidad de alumnos: ");
        iter = s.nextInt();

        for (int i = 0; i < iter; i++) {
            System.out.println("\nAlumno N°" + (i+1));
            System.out.print("Sexo (H/M): ");
            gender = s.next();
            if (!gender.equals("H") && !gender.equals("M")) {
                System.out.println("Género inválido");
                --i;
                continue;
            }
            System.out.print("Peso: ");
            weight = s.nextInt();
            System.out.print("Altura: ");
            height = s.nextInt();
            if (gender.equals("H")) {
                sumWeightH += weight;
                sumHeightH += height;
                totalH++;
            } else {
                sumWeightM += weight;
                sumHeightM += height;
                totalM++;
                
            }
        }
        s.close();
        
        System.out.println("Promedio de tallas - Niños: " + (sumHeightH/totalH));
        System.out.println("Promedio de peso - Niños: " + (sumWeightH/totalH));
        System.out.println("Promedio de tallas - Niñas: " + (sumHeightM/totalM));
        System.out.println("Promedio de peso - Niñas: " + (sumWeightM/totalM));
    }
}