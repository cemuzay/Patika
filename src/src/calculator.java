package src.src;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int select;
        String menu="1- toplama işlemi\n"+
                "2-çıkarma\n"+
                "3-çarpma\n"
                + "4-bölme\n"+
                "5 üslü sayı alma\n"+
                "6 mod alma\n"+
                "7 dikdörtgen alan ve çevre"+
                "0 - çıkış yap" ;

        while(true){
            System.out.println("bir işlem seçiniz.");
            select=scanner.nextInt();
            System.out.println("ilk sayıyı giriniz : ");
            int a=scanner.nextInt();
            System.out.println("ikinci sayıyı giriniz : ");
            int b=scanner.nextInt();
            if(select==0){
                break;
            }
            switch (select) {
                case 1:
                sum(a,b);
                    break;
                case 2:
                    subtract(a,b);
                    break;
                case 3:
                    multiplication(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    exponentialnumber(a,b);
                    break;
                case 6:
                mode(a,b);
                break;
                case 7:
                    rectangle(a,b);
                    break;
                case 8:
                    rectanglearea(a,b);
                    break;

            }
        }
        System.out.println("güle güle");
    }
    public static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam : "+result);
        return a+b;
    }
    public static int subtract(int a,int b){
        int result=a-b;
        System.out.println("çıkarma : "+result);

        return a-b;
    }
    public static int multiplication(int a,int b){
        int result=a*b;
        System.out.println("çarpma : "+result);
        return a*b;
    }
    public static int divide(int a,int b){
        int result=a/b;
        System.out.println("bölme : "+result);
        return a/b;
    }
    public static double exponentialnumber(double a,double b){
        double result=Math.pow(a,b);
        System.out.println("üssü "+result);
        return Math.pow(a,b);
    }
    public static double mode(int a,int b){
        int result=a%b;
        System.out.println("modu : "+result);
    return a%b;
    }
    public static int rectangle(int a,int b){
        int result=2*(a*b);
        System.out.println("çevresi : "+result);
        return 2*(a+b);
    }
    public static int rectanglearea(int a,int b){
        int result=a*b;
        System.out.println("alanı : "+result);
      return a*b;
    }

}
