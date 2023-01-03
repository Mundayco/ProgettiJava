import java.util.Scanner;

public class Triangolo {
    public static void main(String[] Triangolo) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci Base");
        int Base = input.nextInt();
        System.out.println("Inserisci Altezza");
        int Altezza = input.nextInt();
        input.close();

        int area = Base * Altezza;
        int perimetro = Base * 3;

        System.out.println("L'area è :" + area);
        System.out.println("Il perimetro è :" + perimetro);
    }
}
