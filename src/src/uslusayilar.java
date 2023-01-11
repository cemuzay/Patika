package src.src;

import java.util.Scanner;

public class uslusayilar {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner input=new Scanner(System.in);
        System.out.println("üssü alınacak sayı : ");
        n=input.nextInt();
        System.out.println("üst olacak sayı : ");
        k=input.nextInt();
        int total=1;
        for(int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println(total);
    }
}
