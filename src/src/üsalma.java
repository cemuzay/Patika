package src.src;

import java.util.Scanner;

public class üsalma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int a=input.nextInt();
        System.out.println("üs değerini giriniz : ");
        int b=input.nextInt();
        System.out.println("Değeriniz: " + exponential(a,b));
    }
    public static double exponential(double a,double b){
        if(b!=0){
            return a*exponential(a,b-1);
        }else {
            return 1;
        }
    }
}
