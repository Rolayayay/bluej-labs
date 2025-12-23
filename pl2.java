/*Rotimi Olayinka
 * Section 1, TT 12:30pm
 * Program 2, Lab 7
 */

/*
 * This program converts a user’s measurement in inches to centimeters.
It continues to prompt the user until they choose to stop by entering 'N' or 'n'.
 */

import java.util.Scanner;   // Import the Scanner class for user input
public class pl2{
    public static void main(String[] args){
        
       Scanner Keyboard= new Scanner(System.in);    // Create a Scanner object to read user input from the keyboard
       double input=0.0;
       int i=0;
       double math=0.0;
       char input2= 'Y';   // Stores the user’s choice to continue or quit
       
       
      
       while (((input2== 'Y')||(input2== 'y'))){
       System.out.print("Enter the number of inches: ");
       input=Keyboard.nextDouble();
       math= input * 2.54;   // Convert inches to centimeters using the conversion rate (1 inch = 2.54 cm)
       
       System.out.print(input + "inches is " + math + " cm.");    // Display the result of the conversion
       System.out.println();
       
       System.out.println("Do you want to enter another measurment: ");   // Ask the user if they want to enter another measurement 
       String extra_newline=Keyboard.nextLine( );
       input2=Keyboard.nextLine().charAt(0);
       
          
    }
    System.out.println("Goodbye!");     // Once the user enters 'N' or 'n', the loop ends and the program says goodbye
  }
}