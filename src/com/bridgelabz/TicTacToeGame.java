package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    public static char[] board= new char[10];

    public static void getBoard() {
        Arrays.fill(board, ' ');
    }

    public static void displayBoard() {
        System.out.println("---------------");
        for(int i=1;i<board.length;i++) {
            if (i == 4 || i == 7) {
                System.out.println();
                System.out.println("---------------");
            }
            System.out.print("| "+board[i]+" |");
        }
        System.out.println();
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        System.out.println("     Welcome to TIC TAC TOE Game");
        System.out.println("****************************************");

        Scanner in = new Scanner(System.in);

        System.out.println("To Start: PRESS 1");
        int choice = in.nextInt();
        if(choice ==1){
            getBoard();
            displayBoard();
        }
    }
}
