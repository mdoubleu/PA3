import java.util.LinkedList;


public class CollisionCheck {

	
	public void searchForCollision(LinkedList<Objects> objects){
		//searches for a collision-
		for(Objects obj:objects){
			for(Objects obj2:objects){
				if(obj.toString().equals(obj2.toString())){
				}
				else if(obj.canCollide() &&obj2.canCollide() &&obj.collidesWith(obj2)){
					obj.collided(obj2);
					obj2.collided(obj);
					System.out.println(obj.toString()+" "+obj.getCenterX()+" "+obj.getCenterY()+"  "+obj2.toString()
					+" "+obj2.getCenterX()+ " " +obj2.getCenterY());
				}
			}
		}
	}
}
