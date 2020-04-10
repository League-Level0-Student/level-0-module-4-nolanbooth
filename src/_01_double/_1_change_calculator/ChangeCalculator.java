package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		String nickles = JOptionPane.showInputDialog(null, "How many nickels do " + "you have?");
		int numberOfNickles = Integer.parseInt(nickles);
		String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int numberOfDimes = Integer.parseInt(dimes);
		String quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int numberOfQuarters = Integer.parseInt(quarters);
		int nicklesToCents = numberOfNickles * 5;
		int dimesToCents = numberOfDimes * 10;
		int quartersToCents = numberOfQuarters * 25;
		int total = quartersToCents + dimesToCents + nicklesToCents;
		int dollars = total / 100;
		int cents = total % 100;
		JOptionPane.showMessageDialog(null, "You have $" + dollars + "." + cents + ". Spend it well!");

	}
}
