import java.util.Scanner;

public class Quadrato
{

    public static void main(String[] Quadrato) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lato");
        int Lato = input.nextInt();
        input.close();

        int area = Lato * Lato;
        int perimetro =Lato * 4;

        System.out.println("L'area è :" + area);
        System.out.println("Il perimetro è :" + perimetro);
    }
}
