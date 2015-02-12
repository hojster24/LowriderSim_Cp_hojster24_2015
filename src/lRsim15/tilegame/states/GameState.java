package lRsim15.tilegame.states;

import java.awt.Graphics;

import lRsim15.tilegame.Game;
import lRsim15.tilegame.entities.creatures.Player;

public class GameState extends State {
	
	private Player player;
	
	public GameState(Game game){
		super(game);
		player = new Player(game,100,100);
	}
	
	public void tick() {
		player.tick();
	}
	
	public void render(Graphics g) {
		player.render(g);
	}
}
