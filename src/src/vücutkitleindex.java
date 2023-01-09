package src.src;

import java.util.Scanner;

public class vücutkitleindex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your height ");
        double height=input.nextDouble();
        System.out.println("please enter your weight ");
        double weight=input.nextDouble();
        double BMI=weight/Math.pow(height,2);
        System.out.println(BMI);
    }
}
