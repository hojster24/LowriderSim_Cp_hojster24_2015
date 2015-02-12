package lRsim15.tilegame.map;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;

import lRsim15.tilegame.gfx.Assets;

public class TileMap {

	private int x,y;
	
	private int tileSize;
	private int [][] map;
	private int mapWidth;
	private int mapHeight;
	
	private String s;
	
	public TileMap(String s, int tileSize){
		this.tileSize = tileSize;
		this.s = s;
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(s));
			
			mapWidth = Integer.parseInt(br.readLine());
			mapHeight = Integer.parseInt(br.readLine());
			map = new int[mapHeight][mapWidth];
			
			String delimiters = " ";
			for(int row = 0;row<mapHeight;row++) {
				String line = br.readLine();
				String[] tokens = line.split(delimiters);
				for(int col = 0; col<mapHeight; col++){
					map[row][col] = Integer.parseInt(tokens[col]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		
		for(int row = 0;row<mapHeight;row++) {
			for(int col = 0; col<mapHeight; col++){
				int rc = map[row][col];
				if(rc==0){
					g.drawImage(Assets.grass, x+row*tileSize, y+col*tileSize,null);

				}
				if(rc==1){
					g.drawImage(Assets.stone, x+row*tileSize, y+col*tileSize,null);
				}
			}	
		}
	}
}
