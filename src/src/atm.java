package src.src;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int right=3;
        int balance=1500;
        int select;

        while(right>0){
            System.out.println("kullanıcı adınızı giriniz : ");
            String username=input.next();
            System.out.println("şifrenizi giriniz : ");
            String password=input.next();
            if(username.equals("patika")&& password.equals("dev")){
                System.out.println("Merhaba bankamatiğe hoşgeldiniz.");
               do{
                   System.out.println("1-para yatırma\n 2-para çekme\n 3-bakiye sorgulama\n 4-çıkış yap ");
                   select=input.nextInt();
                   if(select==1){
                       System.out.println("para miktarı ");
                       int price=input.nextInt();
                       balance+=price;
                   }else if(select==2){
                       int price=input.nextInt();
                       if(price>balance){
                           System.out.println("bakiye yetersiz.");
                       }else {
                           balance-=price;
                       }

                   }else if(select==3){
                       System.out.println("bakiyeniz : "+ balance);
                   }
               }while (select!=4);
                System.out.println("tekrar görüşmek üzere");
                break;
            }else {
                System.out.println("hatalı kullanıcı adı veya şifre tekrar deneyiniz .");
                if(right==0){
                    System.out.println("hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz. ");
                }
                System.out.println("kalan hakkınız : "+ --right);
            }

        }
        }
}
