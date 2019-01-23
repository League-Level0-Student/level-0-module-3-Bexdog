//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String bob = JOptionPane.showInputDialog(null, "do you like bananas?");
		//2. if they say no, 
	if (bob.equals ("no")) {
			//tell them they are crazy 
		JOptionPane.showMessageDialog(null, "you are crazy");	
		//and end quiz
	System.exit(0);
	}
		//3. if they say yes
	else if(bob.equals("yes")) {
		//	ask them what is their favorite hobby
	String	Bob = JOptionPane.showInputDialog(null, "what is your favorite hobby?");
		//	show a pop up that says "<your hobby> is much better with bananas!"
	JOptionPane.showMessageDialog(null, Bob+(" is much better with bananas!"));
	}
	else{//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
		JOptionPane.showMessageDialog(null, "you are bananas!");
	}
	}

}
