/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
public class OctopusProblem {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("I'm an octopus, so I like the number 8\nEnter a positive value and I'll count up by 8s! Blub blub");
        int numberInput = keyboard.nextInt();

        if(numberInput < 0) {
            System.out.println("That's not a valid number!");
            System.exit(0);
        }

        for(int i=0; i< numberInput; i += 8) {
            System.out.println(i);
        }

        /*
        for( int i=0; i<numberInput; i++) {
            
            if(i%8 == 0) {
                System.out.println(i);
            }

        }*/

        

        keyboard.close();
    }

}