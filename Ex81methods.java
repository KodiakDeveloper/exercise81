package bookExercises;

import javax.swing.JOptionPane;

public class Ex81methods {

	public Boolean isNegativeOrPositive(int a) {

		Boolean verifyNumber;

		if (a < 0) {

			verifyNumber = false;
		}

		else {

			verifyNumber = true;
		}

		return verifyNumber;
	}

	public void isPositiveOrNegative(int a) {

		Boolean verifyNumber;

		if (a < 0) {

			verifyNumber = false;
		}

		else {

			verifyNumber = true;
		}

		JOptionPane.showMessageDialog(null, "Is the number positive?" + "\nAnswer: " + verifyNumber);

	}

}
