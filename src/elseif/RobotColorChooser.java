//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
	
		//1. Create a new Robot
Robot Bob = new Robot();		
		//3. Ask the user what color they would like the robot to draw
while(true) {
Random bOb = new Random();
int jeff = bOb.nextInt(256);
Random bOB = new Random();
int Jeff = bOB.nextInt(256);
Random BoB = new Random();
int JEff = BoB.nextInt(256);
String bob = JOptionPane.showInputDialog("What color do you want the robot to draw?")	;	
		//5. Use an if/else statement to set the pen color that the user requested
if (bob.equals("red")) {
	Bob.setPenColor(Color.RED);
}
else if (bob.equals("blue")) {
	Bob.setPenColor(Color.BLUE);
}
else if (bob.equals("green")) {
	Bob.setPenColor(Color.GREEN);
}
else if (bob.equals("orange")) {
	Bob.setPenColor(Color.ORANGE);
}
else if (bob.equals("yellow")) {
	Bob.setPenColor(Color.YELLOW);
}
else if (bob.equals("black")) {
	Bob.setPenColor(Color.BLACK);
}
else {
	Bob.setPenColor(jeff, Jeff, JEff);
}
		//6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
Bob.penDown();		
Bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)

Bob.setSpeed(9001);
for(int JEFF=0;JEFF<5;JEFF++) {
Bob.move(100);
Bob.turn(72);
}
}
	}
}
