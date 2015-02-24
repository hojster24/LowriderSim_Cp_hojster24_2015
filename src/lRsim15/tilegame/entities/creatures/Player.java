package lRsim15.tilegame.entities.creatures;

import java.awt.Graphics;
import java.util.Arrays;

import lRsim15.tilegame.Game;
import lRsim15.tilegame.gfx.Assets;
import lRsim15.tilegame.map.TileMap;

public class Player extends Creature{

	private Game game;
	private TileMap tileMap;
	private int [] tiles = {0,1};

	public Player(Game game, float x, float y){
		super(x,y);
		this.game = game;
	  //  tileMap = game.getMap();
	}
	public int getX(){
		return (int)x;
	}
	public int getY(){
		return (int)y;
	}

	public boolean tileCheck(int x, int y){
			if(Arrays.asList(tiles).contains( game.getMap().tileID(x,y)))
			{
				System.out.println("tiles: "+true);
				return true;
			}
		return false;
	}
		


	public void tick() {
		if(game.getKeyManager().up)
			y -= 3;
		if(game.getKeyManager().down)
			y += 3;
		if(game.getKeyManager().left)
			x -= 3;
		if(game.getKeyManager().right)
			x += 3;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int)x, (int)y,null);
	}
}
