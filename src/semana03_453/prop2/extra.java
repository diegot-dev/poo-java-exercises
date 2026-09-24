package semana03_453.prop2;

public class extra {
    public static int randint(int min, int max)
    {
        return (int)((max-min+1) * Math.random()) + min;
    }
    
    public static void main(String[] args) {
        System.out.println("Tinka");
        String ticket = "Ticket: ";
        for (int i = 0; i < 10; i++) {
            ticket += randint(0, 99) + " ";
        }
        System.out.println(ticket);
    }
}
