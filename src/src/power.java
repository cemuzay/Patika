package src.src;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int total=0;
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int number=input.nextInt();
        for(int i=1;i<=number;i*=4 ){
            System.out.println(i);
        }
        System.out.println("--------------");
        for(int i=1;i<=number;i*=5){
            System.out.println(i);
        }
    }
}
