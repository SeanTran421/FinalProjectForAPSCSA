/**
 * Final Project
 * Player Class
 * It holds player data and unused assets.
 */

public class Player {
    ///variables needed for the board placement.
    private String name = "";                       ///String
    private int xPos = 0;                       ///integer
    private int yPos = 0;                       ///integer

    ///how the player will be made.
    public Player(String inputN, int x, int y){
        name = inputN;
        xPos = x;
        yPos = y;
    }

    ///getting the name 
    public String getName()  ///unused
    {
        return name;
    }

    ///setting the name to a specific input
    public void setName(String input)  ///unused
    {
        name = input;
    }
    
    ///getting the X-Position of the player
    public int getXPos(){
        return xPos;
    }

    ///getting the Y-Position of the player
    public int getYPos(){
        return yPos;
    }

    ///setting the X-Position of the player to a specific number
    public void setXPos(int num){
        xPos = num;
    }

    ///setting the Y-Position of the player to a specific number
    public void setYPos(int num){
        yPos = num;
    }
}