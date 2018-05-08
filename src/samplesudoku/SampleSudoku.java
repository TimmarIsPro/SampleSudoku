/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplesudoku;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class SampleSudoku {

    static char answerBoard[][] = new char[9][9];
    static char gameBoard[][] = new char[9][9];
    
    static int checks = 5;
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String selection;

        SampleSudoku sudokuApp = new SampleSudoku();
        
        sudokuApp.generateBoard();        
        
        do {
            sudokuApp.displayBoard();
            System.out.println("<enter> to add to board.");
            System.out.println("<check> to check answers. " + checks + " checks remaining.");
            System.out.println("<end> to end game.");
            selection = console.next();
            switch (selection) {
                case "enter":
                    sudokuApp.enterNumber();
                    break;
                case "check":
                    sudokuApp.checkNumbers();
                case "end":
                    break;
                default:
                    break;
            }
        } while (!"end".equals(selection));
    }
    
    public void checkNumbers()
    {
        if (checks == 0)
        {
            System.out.println("No checks remaining");
        }
        else
        {
            for (int i=0; i<gameBoard.length; i++) {
            for (int j=0; j<gameBoard[i].length; j++) {
                if (gameBoard[i][j] != answerBoard[i][j]) {
                    gameBoard[i][j] = '*';
                }
            }
        }
        checks--;
        System.out.println(checks + " checks remaining.");
        }

    }
    
    public void enterNumber()
    {
        int row;
        int column;
        
        System.out.println("Enter Row:");
        row = console.nextInt();
        row--;
        System.out.println("Enter Column: ");
        column = console.nextInt();
        column--;
        System.out.println("Enter answer: ");
        gameBoard[row][column] = console.next().charAt(0);
        
        
    }
    
    
    public void generateBoard()
    {
        for (char[] row: answerBoard) {
            Arrays.fill(row, '*');
        }
        
        //board obtained from http://elmo.sbs.arizona.edu/sandiway/sudoku/examples.html
        
        //note: could read boards from an external file, make some loops to simplify this mess below        
        
        answerBoard[0][0] = '4';
        answerBoard[0][1] = '3';
        answerBoard[0][2] = '5';
        answerBoard[0][3] = '2';
        answerBoard[0][4] = '6';
        answerBoard[0][5] = '9';
        answerBoard[0][6] = '7';
        answerBoard[0][7] = '8';
        answerBoard[0][8] = '1';
        
        answerBoard[1][0] = '6';
        answerBoard[1][1] = '8';
        answerBoard[1][2] = '2';
        answerBoard[1][3] = '5';
        answerBoard[1][4] = '7';
        answerBoard[1][5] = '1';
        answerBoard[1][6] = '4';
        answerBoard[1][7] = '9';
        answerBoard[1][8] = '3';
        
        answerBoard[2][0] = '1';
        answerBoard[2][1] = '9';
        answerBoard[2][2] = '7';
        answerBoard[2][3] = '8';
        answerBoard[2][4] = '3';
        answerBoard[2][5] = '4';
        answerBoard[2][6] = '5';
        answerBoard[2][7] = '6';
        answerBoard[2][8] = '2';
        
        answerBoard[3][0] = '8';
        answerBoard[3][1] = '2';
        answerBoard[3][2] = '6';
        answerBoard[3][3] = '1';
        answerBoard[3][4] = '9';
        answerBoard[3][5] = '5';
        answerBoard[3][6] = '3';
        answerBoard[3][7] = '4';
        answerBoard[3][8] = '7';
        
        answerBoard[4][0] = '3';
        answerBoard[4][1] = '7';
        answerBoard[4][2] = '4';
        answerBoard[4][3] = '6';
        answerBoard[4][4] = '8';
        answerBoard[4][5] = '2';
        answerBoard[4][6] = '9';
        answerBoard[4][7] = '1';
        answerBoard[4][8] = '5';
        
        answerBoard[5][0] = '9';
        answerBoard[5][1] = '5';
        answerBoard[5][2] = '1';
        answerBoard[5][3] = '7';
        answerBoard[5][4] = '4';
        answerBoard[5][5] = '3';
        answerBoard[5][6] = '6';
        answerBoard[5][7] = '2';
        answerBoard[5][8] = '8';
        
        answerBoard[6][0] = '5';
        answerBoard[6][1] = '1';
        answerBoard[6][2] = '9';
        answerBoard[6][3] = '3';
        answerBoard[6][4] = '2';
        answerBoard[6][5] = '6';
        answerBoard[6][6] = '8';
        answerBoard[6][7] = '7';
        answerBoard[6][8] = '4';
        
        answerBoard[7][0] = '2';
        answerBoard[7][1] = '4';
        answerBoard[7][2] = '8';
        answerBoard[7][3] = '9';
        answerBoard[7][4] = '5';
        answerBoard[7][5] = '7';
        answerBoard[7][6] = '1';
        answerBoard[7][7] = '3';
        answerBoard[7][8] = '6';
        
        answerBoard[8][0] = '7';
        answerBoard[8][1] = '6';
        answerBoard[8][2] = '3';
        answerBoard[8][3] = '4';
        answerBoard[8][4] = '1';
        answerBoard[8][5] = '8';
        answerBoard[8][6] = '2';
        answerBoard[8][7] = '5';
        answerBoard[8][8] = '9';
                
        
        
        
        for (char[] row: gameBoard) {
            Arrays.fill(row, '*');
        }
        
        gameBoard[0][3] = '2';
        gameBoard[0][4] = '6';
        gameBoard[0][6] = '7';
        gameBoard[0][8] = '1';
        gameBoard[1][0] = '6';
        gameBoard[1][1] = '8';
        gameBoard[1][4] = '7';
        gameBoard[1][7] = '9';
        gameBoard[2][0] = '1';
        gameBoard[2][1] = '9';
        gameBoard[2][5] = '4';
        gameBoard[2][6] = '5';
        gameBoard[3][0] = '8';
        gameBoard[3][1] = '2';
        gameBoard[3][3] = '1';
        gameBoard[3][7] = '4';
        gameBoard[4][2] = '4';
        gameBoard[4][3] = '6';
        gameBoard[4][5] = '2';
        gameBoard[4][6] = '9';
        gameBoard[5][1] = '5';
        gameBoard[5][5] = '3';
        gameBoard[5][7] = '2';
        gameBoard[5][8] = '8';
        gameBoard[6][2] = '9';
        gameBoard[6][3] = '3';
        gameBoard[6][7] = '7';
        gameBoard[6][8] = '4';
        gameBoard[7][1] = '4';
        gameBoard[7][4] = '5';
        gameBoard[7][7] = '3';
        gameBoard[7][8] = '6';
        gameBoard[8][0] = '7';
        gameBoard[8][2] = '3';
        gameBoard[8][4] = '1';
        gameBoard[8][5] = '8';       
    }
       
    
    public void displayBoard()
    {   
        
        System.out.println();
        for (int row = 0; row<gameBoard.length; row++) {
            for (int col=0; col<gameBoard[row].length; col++) {
                System.out.print(String.format("%5s",gameBoard[row][col]));
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        System.out.println();
        for (int row = 0; row<answerBoard.length; row++) {
            for (int col=0; col<answerBoard[row].length; col++) {
                System.out.print(String.format("%5s",answerBoard[row][col]));
            }
            System.out.println();
        }
        System.out.println();
        */
        
    }
}
