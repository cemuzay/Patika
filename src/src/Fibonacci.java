package src.src;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //a b c
        //  a b c
        //    a b c
       // Scanner input=new Scanner(System.in);
       int a=1;
       int b=1;
       int c;
       int d=0;
        System.out.println(d + " + " +  a + " = "+ b );
       for(int i=1;i<=7; i++){
           c=a+b;
           a=b;
           b=c;
           System.out.println(i + " + " + a  + " = " +c);
       }

    }
}
