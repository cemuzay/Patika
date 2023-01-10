package src.src;

import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Doğum Yılınızı giriniz : ");
        int dogumyili=input.nextInt();
        String cinzodyagi=" ";
       if(dogumyili%12==0){
           cinzodyagi="Maymun";
       }else if(dogumyili%1==1){
           cinzodyagi="horoz";
       }else if(dogumyili%12==2){
         cinzodyagi="köpek";
       }else if(dogumyili%12==3){
           cinzodyagi="Domuz";
       }else if(dogumyili%12==4){
           cinzodyagi="Fare";
       }else if(dogumyili%12==5){
           cinzodyagi="Öküz";
       }else if(dogumyili%12==6){
           cinzodyagi="Kaplan";
       }else if(dogumyili%12==7){
           cinzodyagi="Tavşan";
       }else if(dogumyili%12==8){
           cinzodyagi="Ejderha";
       }else if(dogumyili%12==9){
           cinzodyagi="Yılan";
       }else if(dogumyili%12==10){
           cinzodyagi="At";
       }else if(dogumyili%12==11){
           cinzodyagi="Koyun";
       }
        System.out.println("Çin Zodyağı burcunuz : " + cinzodyagi);
    }
}
