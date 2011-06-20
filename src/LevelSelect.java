import java.util.LinkedList;


public class LevelSelect {
	LinkedList<Integer> level;
	
	public LevelSelect(Difficulty difficulty){
		level=new LinkedList<Integer>();
		
		switch(difficulty){
		case HARD:
			
		case EASY:
			level.add(40);level.add(5);level.add(40);level.add(15);level.add(80);level.add(5);
			level.add(80);level.add(15);level.add(1000);level.add(60);level.add(5);
			//	 X	   X
			//___X__O__X
			
		case MEDIUM:
		}
	}
	
	public LinkedList<Integer> getLevel(){
		return level;
	}
}
