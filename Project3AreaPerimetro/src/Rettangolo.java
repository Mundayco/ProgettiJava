import java.util.Scanner;

public class Rettangolo {
    public static void main(String[] Rettangolo) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci Lato 1");
        int Lato1 = input.nextInt();
        System.out.println("Inserisci Lato 2");
        int Lato2 = input.nextInt();
        input.close();

        int area = Lato1 * Lato2;
        int perimetro = Lato1 * 2 + Lato2 * 2;

        System.out.println("L'area è :" + area);
        System.out.println("Il perimetro è :" + perimetro);

    }
}