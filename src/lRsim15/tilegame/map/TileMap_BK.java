package lRsim15.tilegame.map;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TileMap_BK {

	private int x,y;
	
	private int tileSize;
	private int map [][] = new int [20][12];
	private final int WIDTH = 20;
	private final int HEIGHT = 12;
	
	private String s;
	
	public TileMap_BK(String s, int tileSize){
		this.tileSize = tileSize;
		this.s = s;
	
		// CODE FROM BORLAND/PACMAN BOARD CLASS
		
		File theFile = new File(s);
		try{
			FileInputStream fstream = new FileInputStream(theFile);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			int r =0;
			while((strLine = br.readLine()) != null){
				String splits[]=strLine.split(",");
				for(int c=0;c<19;c++)
					map[r][c]=Integer.parseInt(splits[c]);
				r++;
			}
		}
		catch (Exception e){
			e.printStackTrace();

		}		
		
		// CODE FROM ONLINE
		
//		try {
//			BufferedReader br = new BufferedReader(new FileReader(s));
//			
//			mapWidth = Integer.parseInt(br.readLine());
//			mapHeight = Integer.parseInt(br.readLine());
//			map = new int[mapHeight][mapWidth];
//			
//			String delimiters = " ";
//			for(int row = 0;row<mapHeight;row++) {
//				String line = br.readLine();
//				String[] tokens = line.split(delimiters);
//				for(int col = 0; col<mapHeight; col++){
//					map[row][col] = Integer.parseInt(tokens[col]);
//				}
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
	
		//CODE FROM BORLAND/PACMAN
		
		 for (int r=0;r<WIDTH;r++)
	            for (int c=0;c<HEIGHT;c++)
	            {
	                if (map[r][c]==0)
	                {
	                	g.setColor(Color.blue);
	                    g.fillRect(c*32,r*32,tileSize,tileSize);
	                }
	                else if (map[r][c]==1)
	                {
	                	g.setColor(Color.red);
	                    g.fillRect(c*32,r*23,tileSize,tileSize);
	                }        
	            }	
		
		// CODE FROM ONLINE
		
//		for(int row = 0;row<mapHeight;row++) {
//			for(int col = 0; col<mapHeight; col++){
//				int rc = map[row][col];
//				if(rc==0){
//					g.drawImage(Assets.grass, x+row*tileSize, y+col*tileSize,null);
//
//				}
//				if(rc==1){
//					g.drawImage(Assets.stone, x+row*tileSize, y+col*tileSize,null);
//				}
//			}	
//		}
	}
}
