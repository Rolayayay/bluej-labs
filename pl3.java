/*Rotimi Olayinka
 * Section 1, TT 12:30pm
 * Program 3, Lab 7
 */


/*
 * This program calculates and prints the sum of each row, each column,
 * and both diagonals of a 4x4 2D array (magic square example).
 */


public class pl3{
    public static void main(String [] args){
        int row= 0;
        int col=0;
        
         // Declare and initialize a 4x4 array called 'board'
        // Each row of numbers is enclosed in { }
        int[][] board= { {16, 3, 2, 13},
                         {5, 10, 11, 8},
                         {9, 6, 7, 12},
                         {4, 15, 14, 1} };
        
         // Declare variables to store the sums              
        int total=0;
        int total2=0;
        int firstdiag=0;
        int secdiag=0;
        
    for (row=0; row<board.length; row++){    // Outer loop goes through each row
            total=0;
            for (col=0; col<board[row].length; col++){   // Inner loop goes through each column in the row
                total= total + board[row][col];
                
            }
            System.out.println("The sum of row " + (row + 1) + " is: " + total);   // Print the sum of the current row 
    }
         
        for (col=0; col<board.length; col++){
            total2=0;
            for (row=0; row<board[col].length; row++){
                total2= total2 + board[col][row];
        }
        System.out.println("The sum of col " + (col + 1) + " is: " + total2);
    }
    
    for (int i= 0; i < board.length; i++) {    // Elements are where row index equals column index
            firstdiag += board[i][i];      // Add element from top-left to bottom-right   
        }
    
    for (int i = 0; i < board.length; i++) {     // Elements are where row index + column index = last index
            secdiag += board[i][board.length - 1 - i];      // Add element from top-right to bottom-left

        }
    
        // Print both diagonal sums
    System.out.println("The sum of the main diagonal is: " + firstdiag);
    System.out.println("The sum of the secondary diagonal is: " + secdiag);
  }
}
