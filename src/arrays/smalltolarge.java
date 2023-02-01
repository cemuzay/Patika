package src.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class smalltolarge {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz : ");
        n = input.nextInt();
        System.out.println("Dizinin boyutu n = " + n);
        int[] list = new int[n];
        int min = list[0];
        int max = list[0];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + " " + "elemanı : ");
            list[i] = input.nextInt();
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                int number;
                if (list[i] > list[j]) {
                    number = list[i];
                    list[i] = list[j];
                    list[j] = number;

                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}