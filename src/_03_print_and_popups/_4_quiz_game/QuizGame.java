package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
	
				// 2.  Ask the user a question 
	String input = JOptionPane.showInputDialog("Do you know the answer.");		
				// 3.  Use an if statement to check if their answer is correct
		if(input.equals("yes")) {	
				// 4.  if the user's answer was correct, add one to their score 
			score +=1;
	}		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
	String q2 = JOptionPane.showInputDialog("Do you know my name.");	
		if(q2.equals("yes")) {
			score +=1;
	}
		else {
			score -=1;
	}
	String q3 = JOptionPane.showInputDialog("Do you know the weather.");
		if(q3.equals("yes")) {
			score +=1;
		}
		else {
			score -=1;
		}
		// After all the questions have been asked, tell the user their final score 
	JOptionPane.showMessageDialog(null,score);
	}
}
