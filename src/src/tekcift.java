package src.src;

import java.util.Scanner;

public class tekcift {
    public static void main(String[] args) {
        double ort = 0;
        int bolunen=0;
        Scanner input=new Scanner(System.in);
        System.out.printf("sayı giriniz : ");
        int sayi=input.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                ort+=i;
                bolunen++;
            }
        }
        System.out.println("sayının ortalması "+ ort/bolunen);
    }
}
