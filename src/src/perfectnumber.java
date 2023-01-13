package src.src;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int number=input.nextInt();
        int toplam = 0;

        for(int i=1;i<number;i++) {
            if (number % i == 0) {
                toplam = toplam + i;
            }
        }
        if(toplam==number){
            System.out.println("mükemmel sayıdır. ");
        }else{
            System.out.println("mükemmel sayı değildir.");
        }

    }
}
