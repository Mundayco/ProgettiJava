import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire Numeri");
        int numero1 = input.nextInt();

        System.out.println("Inserire Numeri");
        int numero2 = input.nextInt();

        System.out.println("Risultato:");
        System.out.println(numero1 + numero2);

    }
}