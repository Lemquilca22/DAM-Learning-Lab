import java.util.Scanner;

public class practicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamarray = sc.nextInt();
        int[] ticket = new int[tamarray];
        int ticketactual = 0;
        int nextticket;

        for (int i = 0; i < tamarray; i++) {
            ticket[i] = sc.nextInt();
        }
        for (int i = 0; i < tamarray; i++) {
            ticketactual = ticket[i];
            int colados = 0;
            for (int j = i + 1; j < tamarray; j++) {
                nextticket = ticket[j];
                if (ticketactual > nextticket)
                {
                    colados++;
                }
            }
            if (colados > 0) {
                System.out.println("La persona con el ticket " + ticket[i] + " se ha colado por delante de " + colados + " personas.");
            }
        }
    }

}
