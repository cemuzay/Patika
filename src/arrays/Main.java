package src.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] List= {10,15,20,25,30,35,40,45,50};
        int[] newliste=reverse(List);
        printArray(newliste);
    }
    public static int[] reverse(int[] list){
        int reverse[]=new int[list.length];
        for(int i=0 ,j=list.length-1; i<list.length; i++ ,j--){
            reverse[i]=list[j];
        }
        return reverse;
}
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

