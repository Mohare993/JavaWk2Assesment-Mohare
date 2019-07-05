package directions;

import java.util.Random;

public class East extends Direction{

	private Random r = new Random();

//	private int distanceTraveled = r.nextInt(456);
//	
////	public int getDistanceTraveled() {
////		return  distanceTraveled;
////	} 
//// 
////  When called this way the number stays the same.
	
	public int getDistanceTraveled() {
		return  r.nextInt(700);
	} 

	public East() {
		super();
	}
}
