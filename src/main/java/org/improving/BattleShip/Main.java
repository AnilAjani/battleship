package org.improving.BattleShip;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int [][] board = new int [5][5];
        int [][] ship = new int [4][2];
        int [][] ship2 = new int [3][1];
        int [][] ship3 = new int [2][1];
        int [] shot = new int[2];
        boolean done = false;
        int x;
        int y;


        for(int ships=0 ; ships < 4 ; ships++)
        {
            ship[ships][0]=random.nextInt(5);
            ship[ships][1]=random.nextInt(5);
           // ship[ships][0]=(int) Math.random() * 5 + 1;
           // ship[ships][1]=(int) Math.random() * 5 + 1;
//            board[x][y] = 1;
//            board[x + 1][y] = 1;
//            board[x][y + 1] = 1;
//            board[x + 1][y + 1] = 1;
        }
    while (!done) {
        System.out.println("  1 2 3 4 5");
        for (int r = 0; r < 5; r++) {
            System.out.print((r + 1) + "");
            for (int c = 0; c < 5; c++) {
                if (board[r][c] == -1) {
                    System.out.print(" -");
                } else if (board[r][c] == 0) {
                    System.out.print(" X");
                } else if (board[r][c] == 1) {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
        System.out.println("SELECT ROW");
        shot[0] = scan.nextInt();
        System.out.println("SELECT COL");
        shot[1] = scan.nextInt();

        int row = 0;
        int col = 0;

        for(int line=0 ; line < ship.length ; line++){
            if(ship[line][0] == shot[0]){
                row++;
                if(ship[line][0] == shot[1]){
                    col++;
                }
            }
        }
//        for (int x = 0; x < 5; x++)
//        {
//            for(int y = 0; y < 5; y++)
//            {
//                for(int z = 0; z < 3; z++)
//                {
//                    if(board[x][y] == ship[z][0] && board[x][y] == ship[z][1] )
//                    {
//                        board[ship[z][0]][ship[z][1]]= 1;
//                    }
//                }
//            }
//        }
//        System.out.println(board);
    }
    }



}

