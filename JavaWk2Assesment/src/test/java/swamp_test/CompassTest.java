package swamp_test;

import static org.junit.Assert.*;

import org.junit.Test;

import swamp.Compass;

public class CompassTest {
	
	private Compass c = new Compass();

	@Test
	public void testCompassExists() {
		assertNotNull("Failed to create Compass", this.c);
	}
	
	@Test
	public void testGetDistance() {
		assertNotNull("Failed to get distance", this.c.getDistance());
	}
	

	@Test
	public void testGetFinished() {
		assertNotNull("Failed to get finished statement", this.c.getFinished());
	}
	
	@Test
	public void testGetTroll() {
		assertNotNull("Failed to get finished statement", this.c.getTroll());
	}
	
	@Test
	public void testGetTrollMurder() {
		assertNotNull("Failed to get finished statement", this.c.getTrollMurder());
	}
	
	
	

	

}
