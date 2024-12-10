package bookExercises;

import javax.swing.JOptionPane;

public class Ex81 {

	public static void main(String[] args) {

		String userAnswer;

		Boolean verifyNumber;

		int userInput;

		Ex81methods exercise = new Ex81methods();

		do {

			userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input value"));

			verifyNumber = exercise.isNegativeOrPositive(userInput);

			JOptionPane.showMessageDialog(null, "Is the number positive?" + "\nAnswer: " + verifyNumber);

			exercise.isPositiveOrNegative(userInput);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
