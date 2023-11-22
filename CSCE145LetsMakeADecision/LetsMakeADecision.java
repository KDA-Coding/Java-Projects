/*
 * Written by: Kirk Allgeyer
 */
import java.util.Scanner;
public class LetsMakeADecision {

    public static final String BOX1 = "ET for the Atari ";
    public static final String BOX2 = "Floppy Disk";
    public static final String BOX3 = "A Brand New CPU!";
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String c1Prize = "nothing";
        String c2Prize = "nothing";

        System.out.println("Let's Make a Decision!\nContestant 1, will you choose \"box1\", \"box2\", or \"box3\"?");

        String answer = keyboard.nextLine();

        if(answer.equalsIgnoreCase("box1")) {
            c1Prize = BOX1;
            System.out.println("Contestant 2, will you choose \"box2\" or \"box3\"?");
            answer = keyboard.nextLine();

            if(answer.equalsIgnoreCase("box2")) {
                c2Prize = BOX2;
            }
            else if (answer.equalsIgnoreCase("box3")) {
                c2Prize = BOX3;
            }
            else {
                System.out.println("That's not a valid input. You get \"nothing\" ");
            }
        }
        else if(answer.equalsIgnoreCase("box2")) {
            c1Prize = BOX2;
            System.out.println("Contestant 2, will you choose \"box1\" or \"box3\"?");
            answer = keyboard.nextLine();

            if(answer.equalsIgnoreCase("box1")) {
                c2Prize = BOX1;
            }
            else if (answer.equalsIgnoreCase("box3")) {
                c2Prize = BOX3;
            }
            else {
                System.out.println("That's not a valid input. You get \"nothing\" ");
            }
        }
        else if (answer.equalsIgnoreCase("box3")) {
            c1Prize = BOX3;
            System.out.println("Contestant 2, will you choose \"box1\" or \"box2\"?");
            answer = keyboard.nextLine();

            if(answer.equalsIgnoreCase("box1")) {
                c2Prize = BOX1;
            }
            else if (answer.equalsIgnoreCase("box2")) {
                c2Prize = BOX2;
            }
            else {
                System.out.println("That's not a valid input. You get \"nothing\" ");
            }
        }
        else {
            System.out.println("That's not a valid input. You both get \"nothing\" ");
            System.exit(0);
        }
        System.out.println("Contestant 1 won: "+c1Prize+"\nContestant 2 won: "+c2Prize+"\nThank you for playing!");

        keyboard.close();
        System.exit(0);
    }

}