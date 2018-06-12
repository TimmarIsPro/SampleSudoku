/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplesudoku;
import java.io.*;
/**
 *
 * @author J378925
 */


public class serializeBoard {

    private String fileloc = "saves/gameBoard.ser";
    
    public void serializeBoard(){
        //TODO: build serialise board function
    }
    
    //custom location constructor
    public void serializeBoard(String location){
        fileloc = location;
    }
    
    public boolean save(gameBoard g){
        
        //TODO: add file time stamp to distinguish loading later
        if(g != null){
          try{
              FileOutputStream fos = new FileOutputStream(fileloc);
              try (ObjectOutputStream out = new ObjectOutputStream(fos)) {
                  out.writeObject(g);
              }
              System.out.println("Serialized data is saved in " + fileloc);
          }catch (IOException i) {
            i.printStackTrace();
            return false;
          }   
        }else{
            System.out.println("Failed to save gameboard! No gameboard present.");
            return false;
        }
        return true;
    }
    
    public gameBoard load(){
        
        //TODO: Add multi-file loading
      gameBoard gb = null;
      try {
         FileInputStream fileIn = new FileInputStream(fileloc);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         gb = (gameBoard) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return gb;
      } catch (ClassNotFoundException c) {
         System.out.println("GameBoard class not found");
         c.printStackTrace();
         return gb;
      }
      return gb;
    }
    

}
