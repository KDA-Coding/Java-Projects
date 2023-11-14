/*
 * Written by: Kirk Allgeyer
 */
import java.util.Scanner;
public class InchesToFeet {
    
    public static final double INCHES2FEET = 12.0;
    //Entry Point
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Greetings! Give a height in feet and I will give the number of inches, and feet + inches");

        double feet;
        feet = keyboard.nextDouble();
        keyboard.nextLine();

        double inches = feet*INCHES2FEET;
        int iFeet = (int)(inches/INCHES2FEET);
        int rmInches = (int)(inches%INCHES2FEET);

        System.out.println("In "+feet+"ft there are "+inches+"in. Or "+iFeet+"ft. and "+rmInches+"in.");

        keyboard.close();
        
    }
}
