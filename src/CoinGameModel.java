import java.util.LinkedList;

public class CoinGameModel {
	LinkedList<Objects> level=new LinkedList<Objects>();
	Integer timeInSec;
	LinkedList<Coin> coins;
	CollisionCheck collisions;
	Player player;
	public CoinGameModel(Player player){
		this.player=player;
		LevelSelect game=new LevelSelect(Difficulty.EASY);
		level=new LevelBuilder(game.getLevel()).getObjects();//created level of jewels and squares-
		coins=new LinkedList<Coin>();
		collisions=new CollisionCheck();
		//coins.add(firstCoin);
		level.addLast(player.coin);
	}
	
	public LinkedList<Objects> getLevel(){
		return level;
	}
	public void flingCoin(double velocity, double angle, CoinGameModel model){
		player.flingCoin(velocity, angle, model);
	}
	
}
