import java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {
        int mat,fizik,kimya,türkçe,tarih,müzik;

        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat=input.nextInt();
        System.out.println("fizik notunuz : ");
        fizik=input.nextInt();
        System.out.println("Kimya notunuz : ");
        kimya=input.nextInt();
        System.out.println("tarih notunuz ");
        tarih=input.nextInt();
        System.out.println("türkçe notunuz : ");
        türkçe=input.nextInt();
        System.out.println("müzik notunuz : ");
        müzik=input.nextInt();
        int toplam=mat+fizik+kimya+türkçe+tarih+müzik;
        System.out.println(toplam);
        System.out.println("www.patika.dev ");
    }
}
