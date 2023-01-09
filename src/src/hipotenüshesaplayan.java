package src.src;

import java.util.Scanner;

public class hipotenüshesaplayan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1. kenarı giriniz : ");
        int a=input.nextInt();
        System.out.println("2. kenarı giriniz : ");
        int b=input.nextInt();
        int c= (int) Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüs "+ c);

    }
}