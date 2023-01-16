package src.src;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int number=input.nextInt();
        int prime=prime(number,number/2);
        if(number==2){
            System.out.println(number+" sayısı asaldır.");
        }
       else if(prime==1 || prime==2){
            System.out.println(number+" sayısı asaldır.");
        }else {
            System.out.println(number+" sayısı asal değildir.");
        }
    }
    public static int prime(int num,int i){
            if(i==0){
                return 1;
            }else{
                if(num%i==0){
                    return 0;
                }
                else {
                    return prime(num,i-1);
                }
            }
    }
}
