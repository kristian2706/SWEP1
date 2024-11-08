package blatt7;

import uebungsAufgaben.InputTools;

public class DreiZahlen {
	public static void main(String[] args) {

		int i = 1;
		int[] eingabe = new int[3];

		for (int j = 0; j < eingabe.length; j++) {
			eingabe[j] = InputTools.readInteger("Zahl " + i + " eingeben: ");
			i++;
		}
		boolean a = eingabe[0] != 0;
		boolean b = eingabe[1] != 0;
		boolean c = eingabe[2] != 0;

		if ((a &&( b == c)) || (!a && b != c)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
