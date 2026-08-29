package semana01;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args)
    {
        int month, day, dayLimit;
        boolean evenMonth = false, evenIs31 = false;
        String[] months = {
            "Enero","Febrero","Marzo",
            "Abril","Mayo","Junio",
            "Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"
        }; 
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese los siguientes datos");
        // Mes entre 1 y 12
        while (true) {
            System.out.print("-> Mes: ");
            month = s.nextInt();
            if (1 <= month && month <= 12) break;
            System.out.println("Mes invalido");
        }

        // Determina el maximo de días que puede tener el mes
        if (month != 2) {
            if (month > 7) evenIs31 = true;
            if (month % 2 == 0) evenMonth = true;
            dayLimit = (evenIs31 == evenMonth) ? 31 : 30; // Condicional con XOR
        } else dayLimit = 28;
        
        // Dia entre 1 y el limite obtenido del anterior condicional
        while (true) {
            System.out.print("-> Dia: ");
            day = s.nextInt();
            if (1 <= day && day <= dayLimit) break;
            System.out.println("Día invalido");
        }

        s.close();
        System.out.println(day + " de " + months[month-1]);

    }
}
