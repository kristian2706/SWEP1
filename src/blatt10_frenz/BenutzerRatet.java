package blatt10_frenz;

import uebungsAufgaben.InputTools;

public class BenutzerRatet {
	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 499 + 1);

		boolean correct = false;

		while (!correct) {
			int guessNum = InputTools.readInteger("Guess a number between 0 and 500: ");
			if (guessNum == randomNum) {
				System.out.println("You guessed the correct number!");
				correct = true;
			} else {
				System.out.println("Try " + (guessNum < randomNum ? "Higher!" : "Lower!"));
			}
//			else if (guessNum < randomNum) {
//				System.out.println("Try higher!");
//			} else if (guessNum > randomNum) {
//				System.out.println("Try lower!");
//			}
		}

	}

}
