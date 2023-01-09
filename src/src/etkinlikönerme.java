package src.src;

import java.util.Scanner;

public class etkinlikönerme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sıcaklık giriniz ");
        int heat=input.nextInt();

        if(heat<5){
            System.out.println("kayak yapabilirsiniz.");
        }
        else if(heat>=5 && heat<=15){
            System.out.println("sinemaya gidebilirsiniz .");
        }
        else if(heat>=10 && heat<=25){
            System.out.println("piknik yapabilirsiniz.");
        }
        else if(heat>25){
            System.out.println("yüzmeye gidebilirsiniz.");
        }
    }
}
