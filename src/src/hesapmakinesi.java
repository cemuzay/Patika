package src.src;

import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz : ");
        int n1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz : ");
        int n2 =input.nextInt();
        System.out.println("toplama için 1\n çıkarma için  2\n çarpma için 3\n bölme için 4\n");

        int select=input.nextInt();
        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("yanlış seçim yaptınız.Tekrar deneyiniz. ");

        }

    }
}
