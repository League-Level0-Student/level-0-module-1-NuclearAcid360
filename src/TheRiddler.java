import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main (String[] args) {

		// 1. Make a variable to hold the score
		String answer = "Map";
		int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String guess = JOptionPane.showInputDialog("I have cities but no houses, I have mountains but no trees, I have water but no fish. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (guess.equals(answer) ) {
	JOptionPane.showMessageDialog(null, "You are Super smart!!");
	score = score +1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong");
}
		// 6. Add some more riddles


		// 2. Make a pop up to show the score.
		
	}
}

