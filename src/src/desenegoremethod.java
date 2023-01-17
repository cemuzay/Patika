package src.src;

import java.util.Scanner;

public class desenegoremethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); int sayi = sc.nextInt();
        System.out.print("Lütfen desen aralığını giriniz :"); int sayi2 = sc.nextInt();
        if(sayi <= 0 || sayi2 <=0) System.out.println("negatif tam sayı olamaz .");
        else {
            f(sayi,sayi,sayi2);
        }
    }
    public static int f(int n,int n2, int desenModeli   ){
        if(n > n2){
            return 1;
        }else {
            System.out.print(n + " ");
            if(n > 0){
                return f((n-desenModeli),n2,desenModeli);
            }else {
                desenModeli = -desenModeli;
                return f((n-desenModeli),n2,desenModeli);
            }
        }
    }
}
