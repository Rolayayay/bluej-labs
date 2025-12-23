public class pl1{
    public static void main(String [] args){
        int row= 0;
        int col=0;
        int[][] board= { {16, 3, 2, 13},
                         {5, 10, 11, 8},
                         {9, 6, 7, 12},
                         {4, 15, 14, 1} };
        int total=0;
        
        for (row=0; row<board.length; row++){
            for (col=0; col<board[row].length; col++){
                total= total + board[row][col];
                
            }
            System.out.println("The sum of row " + board + " is: " + total);
        }
                          
    }
  }
