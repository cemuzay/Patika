package src.src;

import java.util.Scanner;

public class teksayigirenekadar {
    public static void main(String[] args) {
        int total = 0;
        int number;
        Scanner input = new Scanner(System.in);
            do {
                System.out.println("sayıları giriniz :");
                number = input.nextInt();
                if(number%4==0){
                    total+=number;
                }
            } while (number % 2 == 0) ;
        System.out.println("toplam " + total);
    }

}
