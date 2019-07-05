package directions;

import java.util.Random;

public class South extends Direction {
	
	private Random r = new Random();

	private int distanceTraveled = r.nextInt(600);
	
	public int getDistanceTraveled() {
		return distanceTraveled;
	}
	
	public South() {
		super();
	}

}
