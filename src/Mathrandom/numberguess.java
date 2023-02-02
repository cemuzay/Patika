package src.Mathrandom;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numberguess {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100);
        //int number=(int)(Math.random()*100);
        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean iswin=false;
        boolean iswrong=false;
        while (right<5){
            System.out.println("lütfen tahmininizi giriniz : ");
            selected=input.nextInt();
            if(selected<=0 || selected>99){
                System.out.println("0 ile 100 arasında sayı giriniz.");
                if(!iswrong){
                    iswrong=true;
                    System.out.println("bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }else{
                    System.out.println("çok fazla hatalı giriş yaptınız. kalan hak : "+ (5-(++right)));
                }
                continue;
            }
            if(selected==number){
                System.out.println("Tebrikler,doğru tahmin ! tahmin ettiğin sayı : "+ number);
                iswin=true;
                break;
            }else{
                System.out.println("hatalı bir sayı girdiniz!");
                if(selected>number){
                    System.out.println(selected+"sayısı,gizli sayıdan büyüktür.");
                }else{
                    System.out.println(selected+"sayısı,gizli sayıdan küçüktür.");
                }
                wrong[right++]=selected;
                System.out.println("kalan hakkı "+(5-right));
            }
        }
        if(!iswin){
            System.out.println("kaybettiniz !");
        }else{
            System.out.println("Tahminleriniz "+ Arrays.toString(wrong));
        }

    }
}
