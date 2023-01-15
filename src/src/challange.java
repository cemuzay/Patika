package src.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class challange {

    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        return f(n-1)+n;
    }

}
