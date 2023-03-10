package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    public static char[] board= new char[10];
    public static char choice,compLetter;

    public static void getBoard() {
        Arrays.fill(board, ' ');
    }

    public static void showBoard() {
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

    public static void chooseLetter(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a Letter to Continue the game: 'X' or 'O'");
        choice= in.next().charAt(0);
        System.out.println("_________________________________________");
        System.out.println("Your Letter: "+choice);
        if(choice=='X') {
            compLetter = 'O';
            System.out.println("Computer Letter: "+compLetter);
        }
        else if(choice=='O') {
            compLetter = 'X';
            System.out.println("Computer Letter: "+compLetter);
        }
        else {
            System.out.println("Enter a valid Letter!!!");
            chooseLetter();
        }
    }

    public static void main(String[] args) {
        System.out.println("     Welcome to TIC TAC TOE Game");
        System.out.println("****************************************");

        Scanner in = new Scanner(System.in);

        System.out.println("To Start: PRESS 1");
        int input = in.nextInt();
        if(input ==1){
            getBoard();
            System.out.println("The TIC TAC TOE Board is Created!");
            showBoard();
            chooseLetter();
        }
    }
}
