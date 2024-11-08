package blatt10_frenz;

import uebungsAufgaben.InputTools;

public class ComputerRatet {
	public static void main(String[] args) {

		boolean correct = false;

		int untereGrenze = 0;
		int obereGrenze = 500;
		int guess;
		int eingabe;

		while (!correct) {
			guess = (untereGrenze + obereGrenze) / 2;
			System.out.println("I'm guessing the number " + guess);
			eingabe = InputTools.readInteger("0 = correct, 1 = lower, 2 = higher: ");

			switch (eingabe) {

			case 0:
				System.out.println("Great, I got it right with " + guess + "!");
				correct = true;
				return;
			case 1:
				obereGrenze = guess;
				break;
			case 2:
				untereGrenze = guess;
				break;
			default:
				System.out.println("Not an option.");
			}
		}

	}

}
