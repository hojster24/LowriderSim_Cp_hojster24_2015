package lRsim15.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage player, dirt, grass, stone, tree,burkeT1,burkeT2,burkeT3,burkeT4;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/sheet.png"));
		
		player = sheet.crop(0, 0, width, height);
     	dirt = sheet.crop(width * 1, 0, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		tree = sheet.crop(width * 4, 0, width, height);
		burkeT1 = sheet.crop(0,height * 1,width,height);
		burkeT2 = sheet.crop(width, height * 1, width, height);
		burkeT3 = sheet.crop(width * 2, height * 1, width, height);
		burkeT4 = sheet.crop(width * 3, height * 1, width, height);
	}	
}