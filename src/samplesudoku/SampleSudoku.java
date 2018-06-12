package samplesudoku;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class SampleSudoku {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String selection;

        //SampleSudoku sudokuApp = new SampleSudoku();

        
        gameBoard gb = new gameBoard();
      
        gb.generateBoard();
                
        
        do {
            displayBoard(gb.getGameBoard(),gb.getAnswerBoard());
            System.out.println("<enter> to add to board.");
            System.out.println("<check> to check answers. " + gb.getChecks() + " checks remaining.");
            System.out.println("<save> to save your progress.");
            System.out.println("<load> to load a saved game.");
            System.out.println("<end> to end game.");
            selection = console.next();

            switch (selection) {
                case "enter":
                    int row;
                    int column;
                    int ans;

                    System.out.println("Enter Row:");
                    row = console.nextInt();
                    row--;
                    System.out.println("Enter Column: ");
                    column = console.nextInt();
                    column--;
                    System.out.println("Enter answer: ");
                    ans = console.next().charAt(0);
                    gb.answer(row, column, ans);
                    break;
                case "check":
                    if(!gb.checkNumbers()){
                         System.out.println("Ending Game!");
                        break;
                    }
                case "end":
                    break;
                case "save":
                    serializeBoard save = new serializeBoard();
                    if(save.save(gb)){
                        System.out.println("Saved Game!");
                    }
                    break;
                case "load":
                    serializeBoard load = new serializeBoard();
                    gameBoard loadedGB = load.load();
                    if(loadedGB != null){
                        gb = loadedGB;
                        System.out.println("Loaded Game!");
                    }
                    break;
                default:
                    break;
            }
        } while (!"end".equals(selection));
    }
    


    static void displayBoard(char[][] gameBoard, char[][] answerBoard)
    {   
        
        System.out.println();
        int rowFormat = 0;  
        System.out.println ("|-----------------------------|");
        System.out.print("|");   
        for(int row = 0; row <9;row++) 
        {
            //adds a line every 3 rows
            if(row==3||row==6||row==9) 
              { 
                
                System.out.println ("|-----------------------------|");     
        
              }
   
            for(int col = 0; col <9; col++)
            {
                //adds a line every 3 columns to create 9x9 squares  
                if(rowFormat == 3)
                { 
 
                    rowFormat = 1;  
                     System.out.print("|");
                  System.out.print(String.format("%2s",gameBoard[row][col]) + " ");
                    
                } 
                else
                { 
                 System.out.print(String.format("%2s",gameBoard[row][col]) + " ");
                rowFormat++;
                }  
                
            }
            
          System.out.println("|");
        }
          System.out.println (" -----------------------------");  
        
        
    }
}