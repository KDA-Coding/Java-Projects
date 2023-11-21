/*
 * Written by: Kirk Allgeyer
 */
import java.util.Scanner;
import java.util.Random;
public class MathChallenge {

    public static final int RNG_RANGE = 10;
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Are you ready for a math challenge?!\n Enter \"yes\" or \"no\"");

        String play = keyboard.nextLine();

        if(play.equalsIgnoreCase("yes")) {
            System.out.println("Let the challenge begin!");
        }
        else {
            System.out.println("Aw...");
            keyboard.close();
            System.exit(0); //Immediately stops the program
        }

        int num1 = rand.nextInt(RNG_RANGE);
        int num2 = rand.nextInt(RNG_RANGE);

        int result = (int)Math.pow(num1, num2);

        System.out.println("What is "+num1+"^" +num2+"?");

        int answer = keyboard.nextInt();

        if (answer == result) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Sorry... Nope...");
        }

        keyboard.close();
    }
}