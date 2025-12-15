/*
 * Rotimi Olayinka
 * Section 1, TT 12:30 pm
 * Lab 10, Program 1
 */


/*
 * The user and the computer can play a dice game wherein both roll three six-sided dice and compare their totals. 
 * It keeps track of the score and announces the winner of each game, continuing to do so until the user chooses to quit.
 */



import java.util.Scanner;
import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int userScore = 0;       // keeps track of how many rounds user has won
        int computerScore = 0;   // keeps track of how many rounds computer has won
        String playAgain = "Y";  // loop control variable

        System.out.println("Welcome to the Dice Game!");

        //Game loop: keeps playing until user enters N
        while (playAgain.equalsIgnoreCase("Y")) {

            // Computer rolls 3 dice and sums them
            int computerRoll = rollThreeDice(rand);
            System.out.println("Computer rolls a " + computerRoll);

            // User rolls 3 dice and sums them
            int userRoll = rollThreeDice(rand);
            System.out.println("You roll a " + userRoll);

            // Determine/print the winner of the round
            if (userRoll > computerRoll) {
                System.out.println("You win this round!");
                userScore++;
            } else if (computerRoll > userRoll) {
                System.out.println("Computer wins this round!");
                computerScore++;
            } else {
                System.out.println("Tie! No winner this time.");
            }

            // Print current score
            System.out.println("Score: You=" + userScore + "  Computer=" + computerScore);

            // Ask user if they want to continue playing
            System.out.print("Would you like to play again? Y/N: ");
            playAgain = keyboard.next();
            System.out.println();
        }

        // Game ends
        System.out.println("Goodbye");
    }
    // rollThreeDice()
    // Rolls three 6-sided dice and returns the total.
    // This method is required because the assignment says we must
    // call Random three times INSIDE the method and return the sum.
    public static int rollThreeDice(Random rand) {
        int d1 = rand.nextInt(6) + 1;  // roll 1–6
        int d2 = rand.nextInt(6) + 1;
        int d3 = rand.nextInt(6) + 1;
        return d1 + d2 + d3;          // return the total
    }
}
//Questions:
//1.a
//2.b
//3.b
//4.a
