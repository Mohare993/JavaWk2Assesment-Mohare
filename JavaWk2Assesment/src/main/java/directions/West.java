package directions;

import java.util.Random;

public class West extends Direction{
	
	private Random r = new Random();

	private int distanceTraveled = r.nextInt(598);
	
	public int getDistanceTraveled() {
		return distanceTraveled;
	}
	
	public West() {
		super();
	}
}
