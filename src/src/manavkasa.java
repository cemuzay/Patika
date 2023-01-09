package src.src;

import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlıcan=5.0;
        System.out.println("kaç kilo armut istersiniz ");
        int armutkilo=input.nextInt();
        System.out.println("kaç kilo elma istersiniz ");
        int elmakilo=input.nextInt();
        System.out.println("kaç kilo domates istersiniz ");
        int domateskilo=input.nextInt();
        System.out.println("kaç kilo muz istersiniz ");
        int muzkilo=input.nextInt();
        System.out.println("kaç kilo patlıcan istersiniz ");
        int patlıcankilo=input.nextInt();
        double total= (double) (armut*armutkilo+elma*elmakilo+domates*domateskilo+muz*muzkilo+patlıcan*patlıcankilo);
        System.out.println(total);

    }
}
