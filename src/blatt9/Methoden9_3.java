package blatt9;

import uebungsAufgaben.InputTools;

public class Methoden9_3 {

	public static int max(int... numbers) throws IllegalArgumentException {

		if (numbers.length == 0) {
			throw new IllegalArgumentException("Das Maximum eines leeren Arrays ist nicht bestimmbar!");
		}

		int maximum = Integer.MIN_VALUE;

		for (int num : numbers) {
			maximum = num > maximum ? num : maximum;
		}
		return maximum;
	}

	public static void main(String[] args) {

		try {
			System.out.println(max());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		int a = InputTools.readInteger("a: ");
		int b = InputTools.readInteger("b: ");
		int c = InputTools.readInteger("c: ");
		int d = InputTools.readInteger("d: ");
		int e = InputTools.readInteger("e: ");

		System.out.println("Maximum von a, b und c: " + max(a, b, c));
		System.out.println("Maixmum von a, b, c, d und e: " + max(a, b, c, d, e));

		int[] numArray = { a, b, c, d, e };

		System.out.println("Maximum: " + max(numArray));

	}

}
