package src.src;

import java.util.Scanner;

public class Dairevecevre {
    public static void main(String[] args) {
        int r;
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        double pi=3.14;
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Dairenin alanı " + alan);
        System.out.println("Dairenin çevresi " + cevre);
    }
}
