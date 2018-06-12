/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplesudoku;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j281740
 */
public class gameBoardTest {
    
    public gameBoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }



    /**
     * Test of checkNumbers method, of class gameBoard.
     */
    @Test
    public void testCheckNumbers() {
        System.out.println("checkNumbers");
        gameBoard instance = new gameBoard();
        char[][] testboard = new char[9][9];
      
        testboard[0][5] = '9';
        char ex = '9';
        char test = testboard[0][5] = '9';
        assertEquals(ex,test);


    }

}
