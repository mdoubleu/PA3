import java.util.LinkedList;

public class LevelBuilder {
	LinkedList<Objects> objects=new LinkedList<Objects>();
	
	public LevelBuilder(LinkedList<Integer> level){

		int checkJewel=0;
		for(int x=0; x<level.size(); x+=2){
			if(level.get(x)==1000){
				x+=1;
				checkJewel=1;
			}
			if(checkJewel==0){
				objects.add(new Square(level.get(x),level.get(x+1)));
			}else{
				objects.add(new Jewel(level.get(x), level.get(x+1)));
			}
		}
	}
	public LinkedList<Objects> getObjects(){
		return objects;
	}
	
}
