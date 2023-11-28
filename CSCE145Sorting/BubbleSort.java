/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
public class BubbleSort {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Bubble Sort Program!\nEnter the size of the Array to sort!");

        int size = keyboard.nextInt();
        if( size <= 0) {
            System.out.println("That's not a valid array size.");
            keyboard.close();
            System.exit(0);
        }

        int a[] = new int[size];

        for(int i=0; i<a.length; i++) {
            System.out.println("Enter value at Index "+i);
            a[i] = keyboard.nextInt();
        }
        //Bubble Sort
        boolean hasSwapped = true;
        while(hasSwapped) {
            hasSwapped = false;

            for(int i=0; i < a.length-1; i++) {
                if(a[i] > a[i]+1) {
                    //Swap
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    hasSwapped = true;
                }
            }
        }
        //Print Values

        System.out.println("The sorted array is");
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        keyboard.close();
    }
}