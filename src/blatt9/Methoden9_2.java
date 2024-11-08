package blatt9;

import uebungsAufgaben.InputTools;

public class Methoden9_2 {

	public static void main(String[] args) {

		int a = InputTools.readInteger("Erste Zahl: ");
		int b = InputTools.readInteger("Zweite Zahl: ");
		int c = InputTools.readInteger("Dritte Zahl: ");
		int d = InputTools.readInteger("Vierte Zahl: ");

		int test1 = groesser(a, b);
		int test2 = groesser(c, d);
		int test3 = groesser(test1, test2);

		System.out.println(test3);

	}

	public static int groesser(int a, int b) {
		return a > b ? a : b;
	}
}
