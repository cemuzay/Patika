package src.src;

import java.util.Scanner;

public class teksayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int sum=0;
        int count=0;
        double avg=0;
            System.out.println("sayı giriniz : ");
            number=input.nextInt();
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    continue;
                }
                System.out.println(i);
            }
            for(int i=1;i<=number;i++){
                if(i%3==0 && i%4==0){
                    sum+=i;
                    count++;
                }else{
                    System.out.println("sayı 3 ve 4 e tam bölünmez .");
                }
            }
        avg=sum/count;
        System.out.println("ortalama : "+ avg);
    }
}
