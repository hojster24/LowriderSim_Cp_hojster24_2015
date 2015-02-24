package lRsim15.tilegame.states;

import java.awt.Graphics;

import lRsim15.tilegame.Game;
import lRsim15.tilegame.entities.creatures.Player;
import lRsim15.tilegame.map.TileMap;

public class GameState extends State {
	
	private Player emmet;
	private TileMap tileMap;
	private String mapName="res/brentwood.txt";
	
	public GameState(Game game){
		super(game);
		tileMap = new TileMap(mapName, 32);
		emmet = new Player(game,100,100);
	}
	
	public TileMap getMap()
	{
		return tileMap;
	}
	
	public void tick() {
		emmet.tick();
		System.out.print("X: "+emmet.getX()+" Y: "+ emmet.getY());
		System.out.println(" ID: "+tileMap.tileID(emmet.getX(),emmet.getY()));
	}
	public void setMap(String s){
		this.mapName = s;
	}
	
	public void render(Graphics g) {
		tileMap.render(g);
		emmet.render(g);
	}
}
