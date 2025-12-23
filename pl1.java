/* Rotimi Olayinka
 * Section 1, TT 12:30
 * Program 1, Lab 7
 */

/*This program calculates and displays the sum of each row and column
in a 4x4 matrix (board). It demonstrates the use of nested loops in Java
 * 
 */


public class pl1{
    public static void main(String [] args){
        int row= 0;
        int col=0;
        int[][] board= { {16, 3, 2, 13},   // Declare and initialize a 2D array named 'board' 
                         {5, 10, 11, 8},
                         {9, 6, 7, 12},
                         {4, 15, 14, 1} };
        int total=0;    // Variable to store the sum of each row
        int total2=0;    // Variable to store the sum of each column
       
        
        for (row=0; row<board.length; row++){    // Outer loop: goes through each row in the board
            total=0;    // Reset total to 0 for each new row
            for (col=0; col<board[row].length; col++){   // Inner loop adds up all the elements in the current row
                total= total + board[row][col];
                
            }    // Display the total sum for the current row
            System.out.println("The sum of row " + (row + 1) + " is: " + total);
        }
         
        for (col=0; col<board.length; col++){     // Outer loop: goes through each column in the board
            total2=0;
            for (row=0; row<board[col].length; row++){    // Inner loop: adds up all the elements in the current column
                total2= total2 + board[row][col];
        }
        System.out.println("The sum of col " + (col + 1) + " is: " + total2);     // Display the total sum for the current column
    }
    
    
  }
}
// Question:

//1. 00000
//2. e
//3. a
//4. yes