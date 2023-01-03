import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire Numeri");
        float numero1 = input.nextInt();

        System.out.println("Inserire Numeri");
        float numero2 = input.nextInt();

        float somma = numero1 + numero2;
        float sottrazione = numero1 - numero2;
        float moltiplicazione = numero1 * numero2;
        float divisione = numero1 / numero2;
        System.out.println("Somma:" + somma);
        System.out.println("Sottrazione:" + sottrazione);
        System.out.println("Divisione:" + divisione);
        System.out.println("Moltiplicazione:" + moltiplicazione);

    }
}