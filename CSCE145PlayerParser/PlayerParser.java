/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
public class PlayerParser {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        //<<name>> <<id>> <<x>> <<y>> <<z>>\n
        System.out.println("Enter the player's name followed by their model id (int), x,y,z position (double) ");
        String input = keyboard.nextLine();

        String copyInput = input;

        int workingIndex = copyInput.indexOf(" ");
        String name = copyInput.substring(0, workingIndex);
        copyInput = copyInput.substring(workingIndex+1);

        workingIndex = copyInput.indexOf(" ");
        String sModelID = copyInput.substring(0, workingIndex);
        int iModelID = Integer.parseInt(sModelID);
        copyInput = copyInput.substring(workingIndex+1);

        workingIndex = copyInput.indexOf(" ");
        String sX = copyInput.substring(0, workingIndex);
        double dX = Double.parseDouble(sX);
        copyInput = copyInput.substring(workingIndex+1);

        workingIndex = copyInput.indexOf(" ");
        String sY = copyInput.substring(0, workingIndex);
        double dY = Double.parseDouble(sY);
        copyInput = copyInput.substring(workingIndex+1);

        String sZ = copyInput.substring(0, workingIndex);
        double dZ = Double.parseDouble(sZ);

        System.out.println("The player "+name+" has a model id of "+iModelID+" and is located at\n"+dX+"\t"+dY+"\t"+dZ);
    }
}