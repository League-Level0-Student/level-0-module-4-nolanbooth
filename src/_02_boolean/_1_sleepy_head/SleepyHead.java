package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?");
//yes =0 no =1
		if (answer == 0) {
			isWeekday = true;

		} else {
			isWeekday = false;
		}
		int answerNumberOne = JOptionPane.showConfirmDialog(null, "Is it a vacation?");
		if (answerNumberOne == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		if (isWeekday = false || isVacation == true) {
			JOptionPane.showMessageDialog(null, "SLEEP IN, THEN!!");
		} else if (isWeekday == true) {
			JOptionPane.showMessageDialog(null, "GET UP!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		} else if (isVacation == true && isWeekday == true) {

		}

	}
	/*
	 * Print “sleep in"? if it is a vacation or a weekend. If it’s a weekday, print
	 * “get up lazybones!"? If it is a weekday, but we are on vacation, print “sleep
	 * in"?.
	 */
}
