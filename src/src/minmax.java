package src.src;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=0;
        int max=0;
        int min=99999999;
        System.out.println("kaç tane sayı giriceksiniz ");
        int n=input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i+"sayıyı giriniz : ");
            number=input.nextInt();
            if(number>max){
                max=number;
            }else if(number<min){
                min=number;
            }
        }
        System.out.println("En büyük sayı "+ max);
        System.out.println("En küçük sayı "+ min);
    }
}
