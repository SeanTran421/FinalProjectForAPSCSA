///importing the scanner unit to get user input
import java.util.Scanner;

/**
 * Final Project
 * Game Class
 * It holds game data and setting up methods for how to play the game
 */

public class Game {
    ///the play method to start the game
    public void play()
    {
        ///variables needed for the user input, map data, length, and width
        Scanner sc = new Scanner(System.in);
        Board map = new Board();
        int length = map.getLength();
        int width = map.getWidth();
        
        ///player variable to get the position of the player
        Player newPlayer = new Player("Player", length / 2, width / 2);

        ///getting temporary positions to change the player position and a specific point to a different number
        int newXpos = 0;
        int newYpos = 0;

        ///String variables for specific actions
        String up = new String("up");
        String right = new String("right");
        String down = new String("down");
        String left = new String("left");
        String help = new String("help");

        ///the off variable to finish the game
        String off = new String("off");

        ///counters to track the movement of the player
        int counter = 0;
        int leftCounter = 0;
        int rightCounter = 0;
        int upCounter = 0;
        int downCounter = 0;

        ///boolean to see if the game is still running
        boolean gaming = true;

        ///populating the map
        map.populate();
        ///setting a position to a number of 0 to track the player
        map.setPos(newPlayer.getXPos(), newPlayer.getYPos(), 0);

        ///how the game will keep going until the player types 'off'
        while(gaming){
            ///getting the position of the player
            int originalXPos = newPlayer.getXPos();
            int originalYPos = newPlayer.getYPos();
            ///displaying the map
            map.printBoard();
            ///asking the player where do they want to move
            System.out.println("Where do you want to move?");
            ///user input
            String decision = sc.nextLine();

            ///basically if the input is the same as the specific string variable, it'll do the actionh
            if(decision.equals(right)){
                if(originalYPos == width - 1)
                {
                    System.out.println("You have reached the edge. You can't cross.");
                }else{
                    newXpos = originalXPos;
                    newYpos = originalYPos + 1;
                    newPlayer.setXPos(newXpos);
                    newPlayer.setYPos(newYpos);
                    map.setPos(newXpos, newYpos, 0);
                    map.setPos(originalXPos, originalYPos, 1);

                    newXpos = 0;
                    newYpos = 0;
                    rightCounter++;
                    counter++;
                }
            }else if(decision.equals(up)){
                if(originalXPos == 0)
                {
                    System.out.println("You have reached the edge. You can't cross.");
                }else{
                    newXpos = originalXPos - 1;
                    newYpos = originalYPos;
                    newPlayer.setXPos(newXpos);
                    newPlayer.setYPos(newYpos);
                    map.setPos(newXpos, newYpos, 0);
                    map.setPos(originalXPos, originalYPos, 1);

                    newXpos = 0;
                    newYpos = 0;
                    upCounter++;
                    counter++;
                }
            }else if(decision.equals(left)){
                if(originalYPos == 0)
                {
                    System.out.println("You have reached the edge. You can't cross.");
                }else{
                    newXpos = originalXPos;
                    newYpos = originalYPos - 1;
                    newPlayer.setXPos(newXpos);
                    newPlayer.setYPos(newYpos);
                    map.setPos(newXpos, newYpos, 0);
                    map.setPos(originalXPos, originalYPos, 1);

                    newXpos = 0;
                    newYpos = 0;
                    leftCounter++;
                    counter++;
                }
            }else if(decision.equals(down)){
                if(originalXPos == length - 1)
                {
                    System.out.println("You have reached the edge. You can't cross.");
                }else{
                    newXpos = originalXPos + 1;
                    newYpos = originalYPos;
                    newPlayer.setXPos(newXpos);
                    newPlayer.setYPos(newYpos);
                    map.setPos(newXpos, newYpos, 0);
                    map.setPos(originalXPos, originalYPos, 1);

                    newXpos = 0;
                    newYpos = 0;
                    downCounter++;
                    counter++;
                }
            }else if(decision.equals(off)){
                gaming = false;
                System.out.println("You have went right: " + rightCounter + " times.");
                System.out.println("You have went left: " + leftCounter + " times.");
                System.out.println("You have went down: " + downCounter + " times.");
                System.out.println("You have went up: " + upCounter + " times.");
                System.out.println("You have moved: " + counter + " times.");
            }else if(decision.equals(help)){
                System.out.println("Type 'help' to get inputs to type.");
                System.out.println("Type 'up' to go up a step.");
                System.out.println("Type 'right' to go right a step.");
                System.out.println("Type 'left' to go left a step.");
                System.out.println("Type 'down' to go down a step.");
                System.out.println("Type 'off' to turn the game off.");
            }
        }

    }
}
