/**
 * Final Project
 * Board Class
 * It holds map data and setting up methods for how to change a specific position
 * to a different number
 */

public class Board {
    ///variables needed to set up the board (5 by 15)
    private int length = 5; ///integer
    private int width = 15; ///integer

    ///ArrayList to create the board
    int board[][] = new int[length][width];                     ///ArrayList full of integers
    
    ///Creates the map so that there is a clear background full of 1s
    public void populate()
    {
        for(int i = 0; i < length; i++)
        {
            for(int c = 0; c < width; c++)
            {
                board[i][c] = 1;
            }
        }
    }

    ///display the map so the player can see
    public void printBoard()
    {
        for(int i = 0; i < length; i++)
        {
            for(int c = 0; c < width; c++)
            {
                System.out.print(board[i][c]);
            }
            System.out.println(" ");
        }
    }

    ///returning the length of the map
    public int getLength()
    {
        return length;
    }

    ///returning the width of the map
    public int getWidth()
    {
        return width;
    }

    ///setting a specific position to a number of their own
    public void setPos(int x, int y, int setter)
    {
        board[x][y] = setter;
    }
}
