package lRsim15.tilegame.states;

import java.awt.Graphics;

import lRsim15.tilegame.Game;
import lRsim15.tilegame.entities.creatures.Player;
import lRsim15.tilegame.map.TileMap;

public class GameState extends State {
	
	private Player player;
	private TileMap tileMap;
	
	public GameState(Game game){
		super(game);
		tileMap = new TileMap("map.txt",32);
		player = new Player(game,100,100);
	}
	
	public void tick() {
		tileMap.tick();
		player.tick();
	}
	
	public void render(Graphics g) {
		tileMap.render(g);
		player.render(g);
	}
}
