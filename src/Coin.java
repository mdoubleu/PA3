
public class Coin extends Objects{
	double radius;
	int checkMovement;
	int checkGameState;
	
	public Coin(double centerX, double centerY) {
		super(centerX, centerY);
		radius=this.width/2;
		checkMovement=0;
		checkGameState=0;
	}
	public void collided(Collidable other){
		if(other.toString().equals("square")||other.toString().equals("coin")){
			checkMovement=1;
			movement();
			
		}else if(other.toString().equals("jewel")){
			System.out.println("coin collided with jewel");
			checkGameState=1;
		}
		//how do i make it stop?
	}

	public boolean movement(){//if the coin hit a square
		if(checkMovement==1){
			return false;
		}else{
			return true;
		}
		
	}
	public boolean gameState(){//coin hit a jewel;
		if(checkGameState>0){
			return false;
		}else{
			return true;
		}

	}
	public String toString(){
		return "coin";
	}
	public String win(){
		return "Congradulations! You're a winner!";
	}
	public String lose(){
		return "I'm sorry, you ran out of disks. Try again!";
	}


}
