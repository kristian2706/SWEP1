package blatt11_müller;

import uebungsAufgaben.InputTools;

public class Aufgabe11_2 {
	public static void main(String[] args) {

		final int MAX_ARRAY = 5;
		int[] a = new int[MAX_ARRAY];
		
		int anzahl = InputTools.readInteger("Wie viele Elemente möchten Sie eingeben? ");
		
		try {
			for(int i = 0; i < anzahl; i++) {
				a[i] = InputTools.readInteger("Eingabe Zahl " + ((int)i+1) + ": ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dieses Array hat max. 5 Plätze.");
		}
		
//		try {
//			
//			int anzahl = InputTools.readInteger("Wie viele Elemente möchten Sie eingeben? ");
//			if(anzahl > MAX_ARRAY) {
//				throw new ArrayIndexOutOfBoundsException("Dieses Array hat max. 5 Plätze.");
//			}
//
//		
//
//		for (int i = 0; i < anzahl; i++) {
//			a[i] = InputTools.readInteger("Eingabe Zahl " + ((int) i + 1) + ": ");
//		}
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Fehler: " + e.getMessage());
//			return;
//		}
	}

}
