package src.src;

import java.util.Scanner;

public class artıkyil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        double artikyilhesap=input.nextDouble();
        String artik="";
        if(artikyilhesap%100==0){
            if(artikyilhesap%400==0){
                artik="Artık yıldır.";
            }else{
                artik="Artık Yıl değildir";
            }
        }
        else{
            artik="Artık Yıl değildir.";
        }
        System.out.println("Yıl " + artik);
    }
}
