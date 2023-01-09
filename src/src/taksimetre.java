package src.src;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double startprice=10;
        double perkm=2.20;
        double total=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz : ");
        km=input.nextInt();
        total+=(km*perkm);
        total+=startprice;
        total=(total<20)? 20 : total;
        System.out.println(total);
    }
}
