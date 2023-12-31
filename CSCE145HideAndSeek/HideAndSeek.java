/*
 * Written by Kirk Allgeyer
 */
import java.util.Scanner;
import java.util.Random;

public class HideAndSeek {
    //Initialize Board Size, Cold Distance, and Warm Distance Constants
    public static final int BOARD_SIZE = 10;
    public static final int COLD_DIST = (BOARD_SIZE/2)*(BOARD_SIZE/2);
    public static final int WARM_DIST = (BOARD_SIZE/4)*(BOARD_SIZE/4);

    /*
    Initialize Empty Characters to make up the "map"
    Player Character that visually represents the user
    Walked Path Character to represent where the player's last
    position was. And the Goal Character to represent the end-game
    condition the player needs to find. 
    */
    public static final char EMPTY = '_';
    public static final char PLAYER = 'X';
    public static final char WALKED_PATH = '#';
    public static final char GOAL = '_';
    
    public static void main(String[] args) {
        //Initialize and assign Scanner and Random Number Generator
        Scanner keyboard = new Scanner(System.in);    
        Random r = new Random();

        //Initialize and assign Player X and Y positions in 2D Array
        int pX = 0;
        int pY = 0;

        //Initialize and assign Goal X and Y position in 2D Array
        int gX = r.nextInt(BOARD_SIZE);
        int gY = r.nextInt(BOARD_SIZE);

        //Initialize 2D Array with X and Y board size equal to BOARD_SIZE constant
        char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

        /* 
        Iterate through Multi-Dimensional Array using Nested For Loop to assign
        each index underscore characters 
        */
        for(int i=0; i<board.length; i++) {

            for(int j=0; j<board[i].length; j++) {
                board[i][j] = EMPTY;
            }
        }

        /*
        Assign player and goal to their previously defined positions
        The Player always starts at 0,0, the goal will spawn at a random
        location anywhere from 0,0 to 9,9

        To-do: Prevent Goal from Spawning on 0,0
        */
        board[pY][pX] = PLAYER;
        board[gY][gX] = GOAL;

        //Welcome player and set control bool "gameOver" to false
        System.out.println("Welcome to Hide and Seek!");
        boolean gameOver = false;

        //While the game isn't over, repeat this gameplay loop
        while(!gameOver) {
            //Print out the Board initially and each time the player completes
            // a "move".
            for(int i=0; i<board.length; i++) {
                for(int j=0; j<board[i].length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }

            /*
             * Manually calculate the squared delta values
             * to represent the distance between the player
             * position and the goal position
             */
            int distance = (pX-gX)*(pX-gX)+(pY-gY)*(pY-gY);

            /*
             * If the calculated distance each loop is 
             * greater than the Cold or Warm distance
             * the respective notification will print.
             * If it's less than those values that means it's
             * equal to or less than them and therefore closer
             * to the goal.
             */
            if(distance > COLD_DIST) {
                System.out.println("You are getting colder");
            }
            else if(distance > WARM_DIST) {
                System.out.println("You're getting warmer");
            }
            else {
                System.out.println("You're getting hotter");
            }

            /*
             * Control prompts to let the user move 1 index
             * positively or negatively in x, y, or both at the same time
             * Player can't move more than 1 index at a time and out
             * of range values will be set to 0 instead.
             */
            System.out.println("Enter -1, 0, or 1 to move in the X direction");
            int dX = keyboard.nextInt();
            System.out.println("Enter -1, 0, or 1 to move in the Y direction");
            int dY = keyboard.nextInt();

            if( dX < -1 || dX > 1) {
                System.out.println("That's not a valid movement value");
                dX = 0;
            }
            if(dY < -1 || dY > 1) {
                System.out.println("That's not a valid movement value");
                dY = 0;
            }

            /*
             * Assign the space the player was last located
             * to have the WALKED_PATH constant character.
             */
            board[pY][pX] = WALKED_PATH;

            /*
             * After assigning previous space the WALKED_PATH
             * character, then increment the player's position
             * on the board
             */
            pX += dX;
            pY += dY;

            /*
             * If the player would move "out of bounds"
             * of the board/arrays, prevent them from doing so by
             * setting their position to either 0
             * or the current BOARD_SIZE-1
             */
            if(pX < 0) {
                pX = 0;
            }
            else if(pX > BOARD_SIZE-1) {
                pX = BOARD_SIZE-1;
            }


            if(pY < 0) {
                pY = 0;
            }
            else if(pY > BOARD_SIZE-1) {
                pY = BOARD_SIZE-1;
            }

            /*
             * After error-checking/validation, then
             * "move" the player to the appropriate indicies
             * on the board
             */
            board[pY][pX] = PLAYER;

            /*
             * When the player's position is equal to
             * the goal's X and Y position in the board/arrays
             * The player wins the game and the loop concludes.
             */
            if(pX == gX && pY == gY) {
                System.out.println("You Win!");
                gameOver = true;
            }
        }
        /*
         * Stream closing recommended practice.
         * May not be recommended/necessary for System.in
         */
        keyboard.close();
    }

}