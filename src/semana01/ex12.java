package semana01;
import java.util.Scanner;

public class ex12 {
    public static float salary(float hours, float salPerHour)
    {
        float resSal = 0;
        if (hours > 40) {
            resSal = ((hours - 40) * 1.5f + 40) * salPerHour;
        } else if (hours <= 40) {
            resSal = hours * salPerHour;
        }

        return resSal;
    }
    public static void main(String[] args)
    {
        float hours, salPerHour;
        double totalSalary;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de horas: ");
        hours = s.nextFloat();
        System.out.print("Ingrese salario por hora: ");
        salPerHour = s.nextFloat();
        s.close();

        totalSalary = salary(hours, salPerHour);
        
        System.out.printf("Salario total: %.2f", totalSalary);
    }
}