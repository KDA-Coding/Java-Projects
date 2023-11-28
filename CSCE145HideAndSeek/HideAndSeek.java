/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
import java.util.Random;

public class HideAndSeek { 
    public static final int BOARD_SIZE = 10;
    public static final int COLD_DIST = (BOARD_SIZE/2)*(BOARD_SIZE/2);
    public static final int WARM_DIST = (BOARD_SIZE/4)*(BOARD_SIZE/4);

    public static final char EMPTY = '_';
    public static final char PLAYER = 'X';
    public static final char WALKED_PATH = '#';
    public static final char GOAL = '_';
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);    
        Random r = new Random();

        int px = 0;
        int py = 0;

        keyboard.close();
    }

}