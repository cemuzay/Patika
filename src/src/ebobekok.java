package src.src;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("n1 sayısı giriniz : ");
        int n1=input.nextInt();
        System.out.println("n2 sayısı giriniz : ");
        int ebob=1;
        int ekok=1;
        int n2=input.nextInt();
        if (n1 < n2 ){
            int i = n1;
            while (i >= 1){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    System.out.println(n1+"'in" + " ve " + n2+"'nin" + " ebobu : " + ebob);
                    ekok = (n1 * n2) / ebob;
                    System.out.println(n1+"'in" + " ve " + n2+"'nin" + " ekoku : " + ekok);
                    break;
                }
                i--;
            }
        }else {
            int i = n2;
            while (i >= 1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println(n1 + "'in" + " ve " + n2 + "'nin" + " ebobu : " + ebob);
                    ekok = (n1 * n2) / ebob;
                    System.out.println(n1 + "'in" + " ve " + n2 + "'nin" + " ekoku : " + ekok);
                    break;
                }
                i--;
            }
        }
        }
}
