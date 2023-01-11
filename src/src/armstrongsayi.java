package src.src;

import java.util.Scanner;

public class armstrongsayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int basamak_sayisi = 0, rakam;
        int toplam = 0;
        System.out.println("bir sayı giriniz : ");
        int number = input.nextInt();
        int gecici = number;
        int gecici2 = number;
        while(gecici > 0) {
            gecici /= 10;
            basamak_sayisi++;
        }
        while(number > 0) {
            rakam = number % 10;
            toplam += Math.pow(rakam, basamak_sayisi);
            number /= 10;
        }
        if(toplam == gecici2) {
            System.out.println(gecici2 + " sayisi armstrong bir sayidir.");
        }
        else {
            System.out.println(gecici2 + " sayisi armstrong bir sayi degildir.");
        }

    }
}
