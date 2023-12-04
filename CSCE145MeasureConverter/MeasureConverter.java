/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
public class MeasureConverter {

    public static final String IN = "INCHES";
    public static final String FT = "FEET";
    public static final String CM = "CENTIMETERS";
    public static void main(String[] args) {
        
        MeasureConverter m = new MeasureConverter();
        m.start();
    }

    public void start() {
        Scanner keyboard = new Scanner(System.in);
        printGreetings();
        boolean quit = false;
        while(!quit) {
            printOptions();
            String unit1 = keyboard.nextLine();
            String unit2 = keyboard.nextLine();

            if(!isValidUnit(unit1) || !isValidUnit(unit2)) {
                System.out.println("One of the units were invalid. Try again");
                continue;
            }
            printInput(unit1, unit2);
            double value = keyboard.nextDouble();
            keyboard.nextLine();
            double result = 0.0;

            if(unit1.equalsIgnoreCase(IN) && unit2.equalsIgnoreCase(FT)) {
                result = inToFt(value);
            }
            else if(unit1.equalsIgnoreCase(IN) && unit2.equalsIgnoreCase(CM)) {
                result = inToCm(value);
            }
            else if(unit1.equalsIgnoreCase(CM) && unit2.equalsIgnoreCase(IN)) {
                result = cmToIn(value);
            }
            else if(unit1.equalsIgnoreCase(CM) && unit2.equalsIgnoreCase(FT)) {
                result = cmToFt(value);
            }
            else if(unit1.equalsIgnoreCase(FT) && unit2.equalsIgnoreCase(IN)) {
                result = ftToIn(value);
            }
            else if(unit1.equalsIgnoreCase(FT) && unit2.equalsIgnoreCase(CM)) {
                result = ftToCm(value);
            }
            else {
                result = value;
            }
        }
    }

    public void printGreetings() {
        System.out.println("Welcome to the Units Converter!");
    }

    public void printOptions() {
        System.out.println("Enter the type of units followed by the second type.\nUnits can be either\""+IN+"\", \""+FT+"\", or \""+CM+"\"");
    }

    public void printResults() {
        
    }

    public boolean isValidUnit(String input) {

        return input.equalsIgnoreCase(IN) || input.equalsIgnoreCase(FT) || input.equalsIgnoreCase(CM);
    }

    public void printInput(String u1, String u2) {
        System.out.println("Enter "+u1+" and I'll determine the number of "+u2+" that is.");
    }

    public double inToFt(double in) {

        return in / 12.0;
    }

    public double inToCm(double in) {
        return in * 2.54; 
    }

    public double cmToIn(double cm) {
        return cm * 0.393701; 
    }

    public double cmToFt(double cm) {
        return cm * 0.0328084; 
    }

    public double ftToIn(double ft) {
        return ft * 12.0;  
    }

    public double ftToCm(double ft) {
        return ft * 30.48; 
    }
}   