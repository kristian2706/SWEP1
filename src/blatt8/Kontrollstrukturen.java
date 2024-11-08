package blatt8;

import uebungsAufgaben.InputTools;

public class Kontrollstrukturen {
	public static void main(String[] args) {
		int a = InputTools.readInteger("Ertste Zahl: ");
		int b = InputTools.readInteger("Zweite Zahl: ");
		int c = InputTools.readInteger("Dritte Zahl: ");

		int[] abc = { a, b, c };
		int temp;

		if (abc[0] > abc[1]) {
			temp = abc[0];
			abc[0] = abc[1];
			abc[1] = temp;
		}
		if (abc[1] > abc[2]) {
			temp = abc[1];
			abc[1] = abc[2];
			abc[2] = temp;
		}
		if (abc[0] > abc[1]) {
			temp = abc[0];
			abc[0] = abc[1];
			abc[1] = temp;
		}
		System.out.println(abc[0] + ", " + abc[1] + ", " + abc[2]);

	}

}
