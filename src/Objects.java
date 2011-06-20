
public abstract class Objects implements Collidable {
	public final int width=10;
	public double centerX;
	public double centerY;
	
	public Objects(double centerX, double centerY){
		this.centerX=centerX;
		this.centerY=centerY;
	}
	public boolean collidesWith(Objects other){
		//checks if the difference in distance from center is 10 at which they touch.
		int checkX=(int) Math.abs(centerX-other.getCenterX());
		int checkY=(int) Math.abs(centerY-other.getCenterY());
		
		if(this.toString().equals("square")&&other.toString().equals("square")){
			return false;
		}else if(this.toString().equals("jewel")&&other.toString().equals("square")){
			return false;
		}
		
		if(checkX<11 &&checkY<11){
			System.out.println(other.toString() +"  "+other.getCenterX()+" " +other.getCenterY()+" "+this.toString() +" "+this.centerX +" "+this.centerY);
			return true;
		}else{
			return false;
		}
		
	}
	public void collided(Collidable other){
		//do the necessary stuff on collision-right?

	}
	public boolean canCollide(){
		//this can be used for when something is normally a collidable but for an instance, 
		//it will be uncollidable; for example when mario gets a star and nothing can hurt him-
		return true;
	}
	public double getCenterX(){
		return centerX;
	}
	public double getCenterY(){
		return centerY;
	}
	public void changeX(double x){
		this.centerX=x;
	}
	public void changeY(double y){
		this.centerY=y;
	}
}
