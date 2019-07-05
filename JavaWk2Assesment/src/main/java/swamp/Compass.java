package swamp;

import java.util.Random;

public class Compass {
	
	private Random r = new Random();
	
	private int distance = r.nextInt(5000);
	
	private String dialReads = "The dial reads  '";

	private String finished = "You see a box sitting on the plain.\r\n" + "Its filled with treasure! You WIN!\r\n" + "The end. \r\n ";
	
	private String troll = "Oh NO! You have just been kidnapped by Josh the QA troll!\r\n" + "You escape but now you're in a different location!  \r\n";
	
	private String trollMurder = "Oh NO! You have just been murdered by Jordan the QA troll. \r\n" + "You are Dead. \r\n" + "GAME OVER!";
	
	public int getDistance() {
		return distance;
	}

	public String getFinished() {
		return finished;
	}

	public Compass() {
		super();
	}

	public String getTroll() {
		return troll;
	}
	
	public String getTrollMurder() {
		return trollMurder;
	}
	

	public String getDailReads() {
		return dialReads;
	}

}
