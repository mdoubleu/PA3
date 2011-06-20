


public interface Collidable {
	
	public boolean collidesWith(Objects other);
	public void collided(Collidable other);
	public boolean canCollide();
}
