package blatt10_frenz;

import uebungsAufgaben.InputTools;

public class Aufgabe_P10_8 {
	public static void main(String[] args) {

		int wahl = InputTools.readInteger("1 = Schachbrett, 2 = Spitzen aus Einsen oder 3 = Durchzählen? ");

		int spalten = InputTools.readInteger("Spalten Anzahl: ");
		int zeilen = InputTools.readInteger("Zeilen Anzahl: ");

		int[][] arr = new int[zeilen][spalten];

		int counter = 0;

		switch (wahl) {
		case 1:
			for (int i = 0; i < zeilen; i++) {
				for (int j = 0; j < spalten; j++) {
					arr[i][j] = (i + j) % 2;
				}
			}
			break;

		case 2:
			int mitte = spalten / 2;
			int links = (spalten - 1) / 2;
			int rechts = spalten / 2;
//			for (int i = 0; i < zeilen; i++) {
//				for (int j = 0; j < spalten; j++) {
//					if ((spalten % 2 == 0 && j >= (mitte - i - 1) && j <= (mitte + i))
//							|| (spalten % 2 != 0 && j >= (mitte - i) && j <= (mitte + i))) {
//						arr[i][j] = 1;
//					} else {
//						arr[i][j] = 0;
//					}
//
//				}
//			}
			for (int i = 0; i < zeilen; i++) {
				for (int j = links; j <= rechts; j++) {
					arr[i][j] = 1;
				}
				if (links > 0) {
					links--;
					rechts++;
				}
			}
			break;

		case 3:

			for (int i = 0; i < zeilen; i++) {
				for (int j = 0; j < spalten; j++) {
					arr[i][j] = ++counter;
				}
			}
			break;
		}

		String str = " " + counter;
//		for (int i = 0; i < zeilen; i++) {
//			for (int j = 0; j < spalten; j++) {
//				System.out.printf("%" + str.length() + "d", arr[i][j]);
//			}
//			System.out.println();
//		}
		for (int[] a : arr) {
			for (int x : a) {
				System.out.printf("%" + str.length() + "d", x);
			}
			System.out.println();
		}

	}

}
