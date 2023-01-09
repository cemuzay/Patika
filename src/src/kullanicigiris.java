package src.src;

import java.util.Scanner;

public class kullanicigiris {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("kullanıcı adınızı giriniz");
        String username=input.next();
        System.out.println("şifrenizi giriniz :");
        String password=input.next();
        if(username.equals("patika")&&password.equals("java123")){
            System.out.println("sisteme giriş yaptınız.");
        }
        else{
            System.out.println("şifreniz yanlış tekrar deneyiniz");
            for(int i=0;i<=3;i++){
                username=input.next();
                password=input.next();
            }

                if(password.equals("java123")|| username.equals("patika")){
                    System.out.println("yanlış giridiniz program kapatılıyor.");

            }

        }

    }
}
