package src.bitirme;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int row;
    int column;
    int size;
    int bomb;
    int[][] map;
    int[][] board;
    boolean game = true;
    Minesweeper(int row, int column){
        this.row = row;
        this.column = column;
        this.size = row*column;
        this.map = new int[row][column];
        this.board = new int[row][column];
        this.bomb = this.size / 4;
    }
    public void run(){
        int row1,col1;
        prepare();
        print(map);
        System.out.println("Game started!");
        while(game){
            int success=0;
            print(board);
            System.out.println("Please enter row between 0 and " + (this.row-1));
            System.out.println("Please enter  column between 0 and " + (this.column-1));
            System.out.print("Row:");
            row1 = input.nextInt();
            System.out.print("Column:");
            col1 = input.nextInt();
            if(row1<0 || row1>=this.row){
                System.out.println("Please enter a valid row!");
                continue;
            }if(col1<0 || col1>=this.column){
                System.out.println("Please enter a valid column!");
                continue;
            }
            if(map[row1][col1]!=-1){
                checkMine(row1,col1);
                success++;
                if(success==size-bomb){
                    System.out.println("Congrats!");
                }
            }
            else{
                game = false;
                System.out.println("Game Over:(");
            }

        }
    }

    public void prepare(){
        int randrow,randcol;
        int count=0;
        while(count!=bomb){
            randrow= rand.nextInt(row);
            randcol= rand.nextInt(column);
            if(map[randrow][randcol]!=-1){
                map[randrow][randcol]=-1;
                count++;
            }
        }
    }

    public void print(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public void checkMine(int r, int c) {
        if ( c+1<=column-1 && map[r][c + 1] == -1) {
            board[r][c]++;
        }
        if (c>0 && map[r][c - 1] == -1) {
            board[r][c]++;
        }
        if (r+1<=row-1 && map[r + 1][c] ==-1) {
            board[r][c]++;
        }
        if (r>0 && map[r - 1][c] == -1) {
            board[r][c]++;
        }
        if(r==0 && map[r + 1][c] == -1){
            board[r][c]++;
        }
        if(r==0 && map[r + 1][c] == -1){
            board[r][c]++;
        }
        if(c+1<=column-1 && map[r][c + 1] == -1) {
            board[r][c]++;
        }else {
            board[r][c] = -2;
        }
    }
}
