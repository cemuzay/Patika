package src.src;

import java.util.Scanner;

public class nothesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fizik,türkçe,kimya,müzik;
        int toplam=0;
        int derssayısı=0;
        System.out.println("matematik notunuz : ");
         mat=input.nextInt();
        System.out.println("fizik notunuzu giriniz : ");
        fizik=input.nextInt();
        System.out.println("türkçe motunuzu giriniz : ");
        türkçe=input.nextInt();
        System.out.println("kimya notunuzu giriniz : ");
        kimya=input.nextInt();
        System.out.println("müzik notunuzu giriniz : ");
        müzik=input.nextInt();
        if(mat>0 &&mat<=100){
            toplam+=mat;
            derssayısı++;
        }
      else  if(kimya>0 &&kimya<=100){
            toplam+=kimya;
            derssayısı++;
        }
      else if(fizik>0 &&fizik<=100){
            toplam+=fizik;
            derssayısı++;
        }
        else if(müzik>0 &&müzik<=100){
            toplam+=müzik;
            derssayısı++;
        }
      else  if(türkçe>0 &&türkçe<=100){
            toplam+=türkçe;
            derssayısı++;
        }
      else {
            System.out.println("0 ile 100 arası not giriniz ...");
        }

        double avarage=toplam/derssayısı;
        if(avarage<=55){
            System.out.println("sınıfta kaldınız seneye tekrar görüşmek üzere ");

        }
        else if(avarage>=100 || avarage>=0){

        }
        else {
            System.out.println("tebrikler geçtiniz.");
        }
        System.out.println("ortalama "+ avarage);
    }
}
