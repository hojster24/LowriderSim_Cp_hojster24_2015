package lRsim15.tilegame.map;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TileMap_V2 {

	private int x,y;
	
	private int tileSize;
    int map [][] = new int [20][12];
	private final int WIDTH = 20;
	private final int HEIGHT = 12;
	
	public TileMap_V2(){
		File theFile = new File("tileMap.csv");
        try{
            FileInputStream fstream = new FileInputStream(theFile);
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            int r=0;
            while ((strLine = br.readLine()) != null)   {
                String splits[]=strLine.split(",");
                for (int c=0;c<19;c++)
                    map[r][c]=Integer.parseInt(splits[c]);
                r++;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void render(Graphics g)
    {
        for (int r=0;r<22;r++)
            for (int c=0;c<19;c++)
            {
                if (map[r][c]==1)
                {
                	g.setColor(Color.red);
                    g.fillRect(c*32,r*32,30,30);
                }
                else if (map[r][c]==0)
                {
                	g.setColor(Color.red);
                	g.fillRect(c*32,r*32,30,30);
                }
            }
    }
}