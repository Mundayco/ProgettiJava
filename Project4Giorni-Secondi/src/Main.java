import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inserire giorni");
        int Giorni = input.nextInt();

        System.out.println("inserire ore");
        int Ore = input.nextInt();

        System.out.println("inserire minuti");
        int Minuti = input.nextInt();

        System.out.println("inserire secondi");
        int Secondi = input.nextInt();
        int risultato = (Giorni * 86400) + (Ore * 3600) + (Minuti * 60) + (Secondi);
        System.out.println( risultato);
    }
}
