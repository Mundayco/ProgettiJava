import java.util.Scanner;

public class Cerchio
{
    public static void main(String[] Cerchio)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci Raggio");
        int Raggio = input.nextInt();
        input.close();

        double area = (Raggio * Raggio) * 3.14;
        double perimetro = (Raggio + Raggio) * 3.14;

        System.out.println("L'area è :" + area);
        System.out.println("Il perimetro è :" + perimetro);
    }
}
