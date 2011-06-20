
public class Player {
	double velocity;
	double angle;
	Coin coin;
	int tries;

	public Player(Coin coin){
		this.coin=coin;
		tries=3;

		
	}
	public void changeVel(double newVel){
		this.velocity=newVel;
	}
	public void changeAng(double newAng){
		this.velocity=newAng;
	}
	public void addCoin(int tries, Coin c){
		switch(tries){
		case(2):
			coin=c;
		case(1):coin=c;
		}
		
	}
	public void flingCoin(double velocity, double angle, CoinGameModel model){
		long time=0;
		long timeNow=System.currentTimeMillis()+0;
		double g=-9.8;
		
		angle=angle*Math.PI/180;//switch degrees to radians-
		
		long yVelocity=(long) (velocity*(Math.sin(angle)));
		long xVelocity=(long)(velocity*(Math.cos(angle)));
		
		long distance=(long)(xVelocity*time);
		long changeY=(long)(yVelocity+g*time);
		
		double holdX=coin.getCenterX();
		double holdY=coin.getCenterY();
		
		

		//calculates the parabola travelled based on inital velocity and angle and stops when y=0-
		if(coin.gameState()&&coin.movement()){
			while(coin.centerY>0){
				if(coin.gameState()==false){
					System.out.println(coin.win());
					break;
				}
				time=((System.currentTimeMillis()-timeNow)/1000);
				changeY=(long)(yVelocity+g*time);
				distance=(long)(xVelocity*time);
				
				model.collisions.searchForCollision(model.level);
			
				if(coin.movement()){
					coin.changeX(holdX+distance);
					coin.changeY(holdY+changeY);
				}else{
					tries--;
					System.out.println("coin collided with square or coin, coin is now frozen, you have "+tries+" tries left.");
					this.addCoin(tries, new Coin(5,5));
					if(tries==0){
						System.out.println("No more coins, game over.");
						break;
					}
					break;
				}
				System.out.println(coin.getCenterX()+" x   |    y "+ coin.getCenterY());
				}
			
			}
		if(coin.centerY<0){
			tries--;
			System.out.println("coin collided the ground, you have "+tries+" tries left.");
			this.addCoin(tries, new Coin(5,5));
			
		}
		
		}
	}
