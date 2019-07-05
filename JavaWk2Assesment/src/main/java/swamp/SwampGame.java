package swamp;

import java.util.Scanner;

import directions.East;
import directions.North;
import directions.South;
import directions.West;

public class SwampGame {

	private String start = "Grey foggy clouds float oppressively close to you, \r\n" + "\r\n"
			+ "reflected in the murky grey water which reaches up your shins.\r\n" + "\r\n"
			+ "Some black plants barely poke out of the shallow water.\r\n" + "\r\n"
			+ "Try \"north\",\"south\",\"east\", \"west\" or \"QUIT\" \r\n" + "\r\n"
			+ "You notice a small watch-like device in your left hand.  \r\n" + "\r\n"
			+ "It has hands like a watch, but the hands don't seem to tell time. \r\n";

	private Compass c = new Compass();

	private North north = new North();

	private East east = new East();

	private West west = new West();

	private South south = new South();

	public void startGame() {
		int dist = c.getDistance();
		System.out.println(start);
		boolean dieCheck = false;
		boolean quitCheck = false;

//		while (quitCheck == false) {
			while (dist > 0) {
				if ((dist < 400 && dist > 300) || (dist < 750 && dist > 700)) {
					System.out.println(c.getTroll());
					dist = 2534;
				}

				if ((dist < 550 && dist > 500) || (dist < 1200 && dist > 1150)) {
					System.out.println(c.getTrollMurder());
					dist = 0;
					dieCheck = true;
					break;
				}
				System.out.println(c.getDailReads() + dist + "m'\r\n");
				Scanner scan = new Scanner(System.in);
				String userInput = scan.nextLine();
				if (userInput.equals("North") || userInput.equals("north")) {
					dist = dist - north.getDistanceTraveled();

				} else if (userInput.equals("South") || userInput.equals("south")) {
					dist = dist - south.getDistanceTraveled();

				} else if (userInput.equals("East") || userInput.equals("east")) {
					dist = dist - east.getDistanceTraveled();

				} else if (userInput.equals("West") || userInput.equals("west")) {
					dist = dist - west.getDistanceTraveled();

				} else if (userInput.equals("QUIT") || userInput.equals("quit")) {
					quitCheck = true;
					dieCheck = true;
					break;

				} else {
					System.out.println("Please enter 'North', 'East', 'South', 'West' or 'Quit'");
				}

			}

			if (dieCheck == false) {
				System.out.println(c.getDailReads() + 0 + "m'\r\n");
				System.out.println(c.getFinished());
////				System.out.println("Would you like to play again?\r\n" +"Press enter or type 'N' to quit.\r\n");
////				Scanner scan2 = new Scanner(System.in);
////				String userInput2 = scan2.nextLine();
////				if (userInput2.equals("N") || userInput2.equals("n")) {
////					System.out.println("Thanks for playing!");
////					quitCheck = true;
////					dieCheck = true;
////					dist = c.getDistance();
////					break;
////
////    Couldn't get this fully working :).  - Ask to play again after game ends. - 

			}else if (quitCheck == true) {
					System.out.println("Thanks for playing!");
				}
			}
		

	
}
