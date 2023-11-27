/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
public class DoWhileFactorial {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a value 1 or greater, and I'll calculate its factorial.");
        int factValue = keyboard.nextInt();

        if (factValue <= 0) {
            System.out.println("That's not a valid value");
            System.exit(0);
        }

        int factCopy = factValue;
        int factorial = 1;
        do {
            factorial *= factCopy;
            factCopy--;
        } while(factCopy > 0);

        System.out.println("The factorial of"+factValue+" is "+factorial);

        keyboard.close();
    }

}