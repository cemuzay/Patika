package src.src;

import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int day,month;
        System.out.println("doğdunuz ayı giriniz : ");
        month=input.nextInt();
        System.out.println("doğduğunuz günü giriniz : ");
        day=input.nextInt();
        String burc="";
        if(month==1 || month==2){
            if(day>=1 && day<=31){
                if(day<22){
                    burc="oğlak";
                }else{
                    burc="kova";
                }
            }else {
                System.out.println("yanlış gün ve ay");
            }
        }else if(month==3||month==4){
            if(day>=1 && day<=31){
                if(day>=20){
                    burc="balık";
                }else{
                    burc="koç";
                }
            }
            else {
                System.out.println("yanlış gün ve ay");
            }
        }else if(month==5 || month==6){
            if(day>=1 && day<=31){
                if(day>22){
                    burc="boğa";
                }else{
                    burc="ikizler";
                }
            }
            else {
                System.out.println("yanlış gün ve ay");
            }
        }else if(month==7|| month==8){
            if(day>=1 && day<=31){
                if(day>22){
                    burc="yengeç";
                }else{
                    burc="aslan";
                }
            }
            else {
                System.out.println("yanlış gün ve ay");
            }
        }else if(month==9|| month==10){
            if(day>=1 && day<=31){
                if(day>22){
                    burc="başak";
                }else{
                    burc="terazi";
                }
            }
            else {
                System.out.println("yanlış gün ve ay");
            }
        }else if(month==11||month==12){
            if(day>=1 && day<=31){
                if(day>22){
                    burc="akrep";
                }else{
                    burc="yay";
                }
            }
            else {
                System.out.println("yanlış gün ve ay");
            }
        }
        else {
           burc="oğlak";
        }
        System.out.println("burcunuz : "+ burc);
    }
}
