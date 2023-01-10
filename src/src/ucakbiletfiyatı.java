package src.src;

import java.util.Scanner;

public class ucakbiletfiyatı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mbu = 0.10;
        double cocukindirim = 0.50;
        double ogrenciindirim = 0.10;
        double yaslıindirim = 0.30;
        double gidisdonusindirimi = 0.20;
        System.out.println("ne kadar mesafe gitmek istiyorsunuz.");
        double km = input.nextDouble();
        int normaltutar = (int) (km * mbu);
        System.out.println("yaşınızı giriniz : ");
        int yas = input.nextInt();
        System.out.println("gidişse 1 gidiş dönüş ise 2");
        int yolculuktipi = input.nextInt();

        if (km >= 0 && yas >= 0 && yolculuktipi == 1 || yolculuktipi == 2) {

            if (yas < 12) {
                int yasindirimi = (int) (normaltutar * cocukindirim);
                normaltutar -= yasindirimi;

            } else if (yas >= 12 && yas <= 24) {
                int ogrenciindirimi = (int) (normaltutar * ogrenciindirim);
                normaltutar -= ogrenciindirimi;
            } else if (yas > 65) {
                int yaslıindirimi = (int) (normaltutar * yaslıindirim);
                normaltutar -= yaslıindirimi;
            }

        } if (yolculuktipi == 2) {
            int gidisdonus = (int) (normaltutar * gidisdonusindirimi);
            normaltutar = (int) ((normaltutar- (gidisdonus))*2);
        }else {
            System.out.println("hatalı veri girdiniz");
        }
        System.out.println(normaltutar + " TL");
    }
}
