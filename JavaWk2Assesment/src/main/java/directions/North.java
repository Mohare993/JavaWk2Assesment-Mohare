package directions;

import java.util.Random;

public class North extends Direction {

	private Random r = new Random();

	private int distanceTraveled = r.nextInt(175);

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public North() {
		super();
	}

}
