/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
public class SelectionSort {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);        
        System.out.println("Welcome to the Selection Sort Program!\nEnter the size of the Array to sort!");

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
        //Selection Sort
        for(int i =0; i < a.length; i++) {
            int smallestIndex = i;

            for(int j=i+1; j<a.length; j++) {
                if(a[j] < a[smallestIndex]) { 
                    smallestIndex = j;
                }
            }
            if(smallestIndex != i) {
                //Swap
                int temp = a[i];
                a[i] = smallestIndex;
                a[smallestIndex] = temp;
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