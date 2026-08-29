package semana01;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args)
    {
        int slotsGen = 30, slotsPed = 25, slotsTrauma = 10;
        int patGen, patPed, patTrauma, totalPad;
        float costGen = 10f, costPed = 15f, costTrauma = 20f;
        float amountGen, amountPed, amountTrauma;
        float totalAmount;
        boolean wereQuoEx = false;
        
        Scanner s = new Scanner(System.in);
        System.out.println("TOTAL DE PACIENTES POR SERVICIO");
        System.out.print("Medicina general: ");
        patGen = s.nextInt();
        System.out.print("Pediatria: ");
        patPed = s.nextInt();
        System.out.print("Traumatologia: ");
        patTrauma = s.nextInt();
        s.close();

        /* Calculo del importe por servicio y total */
        amountGen = costGen * patGen;
        amountPed = costPed * patPed;
        amountTrauma = costTrauma * patTrauma;
        totalPad = patGen + patPed + patTrauma;
        totalAmount = amountGen + amountPed + amountTrauma;
        wereQuoEx = (patGen > slotsGen) || (patPed > slotsPed) || (patTrauma > slotsTrauma);
        
        System.out.println("\nIMPORTE TOTAL POR SERVICIO");
        System.out.printf("Medicina General (%d pacientes): S/ %2f\n", patGen, amountGen);
        System.out.printf("Pediatria (%d pacientes): S/ %2f\n", patPed, amountPed);
        System.out.printf("Traumatologia (%d pacientes): S/ %2f\n", patTrauma, amountTrauma);
        System.out.printf("IMPORTE TOTAL DEL DIA (%d pacientes): S/ %2f\n", totalPad, totalAmount);

        System.out.println("\nCUPOS EXCEDIDOS:");
        if (patGen > slotsGen) System.out.printf("Medicina general: %d pacientes de %d cupos\n", patGen, slotsGen);
        if (patPed > slotsPed) System.out.printf("Pediatria: %d pacientes de %d cupos\n", patPed, slotsPed);
        if (patTrauma > slotsTrauma) System.out.printf("Traumatologia: %d pacientes de %d cupos\n", patTrauma, slotsTrauma);
        if (!wereQuoEx) System.out.println("No se excedieron los cupos en ningun servicio");
    }
}
