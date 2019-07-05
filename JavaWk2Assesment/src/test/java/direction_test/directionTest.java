package direction_test;

import static org.junit.Assert.*;

import org.junit.Test;

import directions.East;
import directions.North;
import directions.South;
import directions.West;

public class directionTest {

	private North north = new North();

	private East east = new East();

	private West west = new West();

	private South south = new South();

	@Test
	public void testNorthExists() {
		assertNotNull("Failed to create North", this.north);
	}

	@Test
	public void testEastExists() {
		assertNotNull("Failed to create East", this.east);
	}
	
	@Test
	public void testSouthExists() {
		assertNotNull("Failed to create South", this.south);
	}
	
	@Test
	public void testWestExists() {
		assertNotNull("Failed to create West", this.west);
	}
	
	@Test
	public void testNGetDistance() {
		assertNotNull("Failed to get Distance", this.north.getDistanceTraveled());
	}
	

	@Test
	public void testSGetDistance() {
		assertNotNull("Failed to get Distance", this.south.getDistanceTraveled());
	}

}