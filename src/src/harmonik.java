package src.src;

import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("N sayısını giriniz : ");
        int n=input.nextInt();
        double result=0;
        for(double i=1;i<=n;i++){
            result+= (double)(1.0/i);
        }
        System.out.println(result);
    }
}
