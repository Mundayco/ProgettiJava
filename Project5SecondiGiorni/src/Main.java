import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Inserire numero secondi");
        int S = input.nextInt();


        int G = S / 86400;
        int RG = S % 86400;

        int O = RG / 3600;
        int RO = RG % 3600;

        int M = RO / 60;
        int RM = RO % 60;

        int RS = RM;

        System.out.println(G);
        System.out.println(O);
        System.out.println(M);
        System.out.println(RM);

    }
}