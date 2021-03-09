 //A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid
{
	private Drawable[][] grid;
	
	public Grid()
	{
		setSize(0,0);
	}

	public Grid(int rows, int cols)
	{
    grid = new Drawable[rows][cols];
	}

	public void setSize(int rows, int cols)
	{
    grid = new Drawable[rows][cols]; 
	}

	public void setSpot(int row,int col, Drawable val)
	{
    grid[row][col] = val;

	}
	
	public Drawable getSpot(int row, int col)
	{
		return grid[row][col];
	}
	
	public int getNumRows()
	{
		return grid.length;
	}
	
	public int getNumCols()
	{
		return grid[0].length;
	}

	public boolean drawGrid(Graphics window)
	{
		boolean full=true;
		
		//for loop for row
    for (int i = 0; i< grid.length; i++)
    {
			//for loop for col
      for (int j = 0; j<grid[i].length; j++)
      {
				//get current Drawable
        Drawable d = grid[i][j];
					//if it is null
					if (d!=null)
          {
            d.draw(window);

            //System.out.println("null");
          } else {
					//else
             full = false;
          }
      }
    }
		return full;
	}
	
	public String toString()
	{
		String output="";
    for (int i = 0; i<grid.length; i++)
    {
      for (int j = 0; j<grid[i].length; j++)
      {
        if (grid[i][j]!=null)
        {
          output= output + grid[i][j] + " ";
        } else {
          output+="null ";
        }
          
      }
      output+="\n";
    }
    




		return output;
	}
}
