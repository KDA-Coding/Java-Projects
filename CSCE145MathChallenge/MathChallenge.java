/*
 * Written by: Kirk Allgeyer
 */
import java.util.Scanner;
public class MathChallenge {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Are you ready for a math challenge?!\n Enter \"true\" or \"false\"");

        boolean play = keyboard.nextBoolean();

        if(play) {
            System.out.println("Let the challenge begin!");
        }
        else {
            System.out.println("Aw...");
            keyboard.close();
            System.exit(0); //Immediately stops the program
        }

        int num1 = 2;
        int num2 = 3;

        int result = num1 + num2;

        System.out.println("What is "+num1+" plus " +num2+"?");

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