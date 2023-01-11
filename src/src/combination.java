package src.src;

import java.util.Enumeration;
import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz : ");
        int number=input.nextInt();
        System.out.println("ikinci sayıyı giriniz : ");
       int number2=input.nextInt();
        int difference=number-number2;
        int n=1;
        int r=1;
        int factorial=1;
        for(int i=1;i<=number;i++){
           n=n*i;
        }
        for(int j=1;j<=number2;j++){
            r=r*j;
        }
        for(int k=1;k<=difference;k++){
            factorial=factorial*k;
        }
            int combination=n/(r*factorial);
        System.out.println(combination);
        }
}
