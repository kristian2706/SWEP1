package blatt6;

import uebungsAufgaben.InputTools;

public class Ostern {
	public static void main(String[] args) {
		System.out.println("Osterdatumberechnung zwischen 1900 und 2099");
		boolean validNum = true;
		int j = 0;
		while (validNum) {
			j = InputTools.readInteger("Vierstellige Jahreszahl: ");
			if (j < 1900 || j > 2099) {
				System.out.println("Zahl muss zwischen 1900 und 2099 liegen!");
			} else {
				validNum = false;
			}
		}
		int n = j - 1900;
		int a = n % 19;
		int b = ((7 * a) + 1) / 19;
		int m = ((11 * a) + 4 - b) % 29;
		int q = n / 4;
		int w = (n + q + 31 - m) % 7;
		int p = 25 - m - w;

		if (p > 0) {
			System.out.println("Ostersonntag: " + p + ". April");
		} else {
			System.out.println("Ostersonntag: " + (p + 31) + ". März");
		}

	}

}
