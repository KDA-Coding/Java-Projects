/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGuesser {

    public static final int UPPER_NUMBER = 100;
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = rand.nextInt(UPPER_NUMBER);

        System.out.println("I'm thinking of a number from 0 to "+(UPPER_NUMBER-1) +"\nGuess the number!");

        int guessNumber = 0;
        boolean correctGuess = false;

         while(!correctGuess) {

            guessNumber = keyboard.nextInt();
            if(guessNumber > secretNumber) {
                System.out.println("That's too high!");
            }
            else if(guessNumber < secretNumber) {
                System.out.println("That's too low!");
            }
            else {
                System.out.println("That's correct");
                correctGuess = true; 
            }
         }

         keyboard.close();
    }
}