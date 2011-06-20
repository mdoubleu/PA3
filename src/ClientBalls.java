
public class ClientBalls {
	public static void main(String[] args){
		CoinGameModel test=new CoinGameModel(new Player(new Coin(60,20)));
		test.flingCoin(40, 90, test);
		
	}
}
