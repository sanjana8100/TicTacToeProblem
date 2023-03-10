package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    public static char[] board= new char[10];
    public static char choice,compLetter,lastPlayer;

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

    public static void makeMove(char Letter){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position you want to place your letter:");
        int position= in.nextInt();
        if((position>=1 && position<=9) && board[position]==' ') {
            board[position] = Letter;
            System.out.println("The Current state of the board is:");
            showBoard();
        }
        else {
            System.out.println("Enter a valid position!!!");
            makeMove(Letter);
        }
    }

    public static boolean Toss(){
        Scanner in = new Scanner(System.in);
        System.out.println(" Tossing a coin to determine who plays first...");
        System.out.println("Please make a choice:\n1.Heads\t2.Tails");
        int userChoice= in.nextInt();
        double toss= Math.random();
        if((toss<0.5 && userChoice==1)||(toss>=0.5 && userChoice==2)) {
            System.out.println("You won the toss and the game begins with your move!");
            return true;
        }
        else {
            System.out.println("Computer won the toss and the game begins with Computer's move!");
            return false;
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
            boolean win= Toss();
            System.out.println("The Current state of the board is:");
            showBoard();
            if(win)
                lastPlayer=compLetter;
            else
                lastPlayer=choice;
            for(int i=1;i<board.length;i++)
                while(board[1]==' '||board[2]==' '||board[3]==' '||board[4]==' '||board[5]==' '||board[6]==' '||board[7]==' '||board[8]==' '||board[9]==' '){
                        if(lastPlayer==choice){
                            makeMove(compLetter);
                            lastPlayer=compLetter;
                        }
                        else{
                            makeMove(choice);
                            lastPlayer=choice;
                        }
                }
        }
    }
}
