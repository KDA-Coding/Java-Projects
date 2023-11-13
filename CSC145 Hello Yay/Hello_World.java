/*
 * Written by Kirk Allgeyer
*/
import java.util.Scanner;

public class Hello_World {
    
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        System.out.println("I can print numbers and such. So... Gimme Numbers!!!");

        Scanner keyboard = new Scanner(System.in);

        int value1 = keyboard.nextInt();
        int value2 = keyboard.nextInt();

        int result = value1 + value2;

        System.out.println("The result of "+value1+" + "+value2+" is: "+result);

        keyboard.close();
    }
}
