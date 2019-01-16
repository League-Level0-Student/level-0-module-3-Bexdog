//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int Bob = new Random().nextInt(10);
		int bob = new Random().nextInt(101);
		for (int i=0; i<Bob; i++) {
		
		
		// 2. Print out the random variable above
		System.out.println(bob);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String jeff = JOptionPane.showInputDialog("Guess a number between 0 and 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int Jeff = Integer.parseInt(jeff);
			// 5. if the guess is correct
				// 6. Win
if (Jeff == bob) {
	System.out.println("You Win!");
	System.exit(0);

}


				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
 if (Jeff > bob) {
	System.out.println("Too high");
}
			
// 7. if the guess is high
else if (Jeff < bob) {
	System.out.println("Too low");
}
// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		}
	
			System.out.println("YOU LOSE");
		

	}

}


