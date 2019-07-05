package swamp_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import swamp.SwampGame;

public class SwampTest {
	
	SwampGame testGame = new SwampGame();

	
	@Before 
	public void init() {
		}

	@Test
	public void testSwampGame() {
		assertNotNull("Game doesn't starts", this.testGame);

	}
	

}
