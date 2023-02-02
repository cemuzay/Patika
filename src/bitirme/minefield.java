package src.bitirme;

import java.util.Scanner;

public class minefield {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows does has board:");
        int row= input.nextInt();
        System.out.print("How many columns does has board:");
        int col = input.nextInt();
        Minesweeper mine = new Minesweeper(row,col);
        mine.run();
    }
}
