package blatt8;

import uebungsAufgaben.InputTools;

public class HauptFiguren2 {
	public static void main(String[] args) {

		int n = InputTools.readInteger("Anzahl der Figuren: ");
		Figur[] figuren = new Figur[n];

		for (int i = 0; i < n; i++) {
			String choice = InputTools.readString("r eingeben für Rechteck, k eingeben für Kreis: ");
			char x = choice.charAt(0);
			float ref_x = (float) InputTools.readDouble("Referenzpunkt x: ");
			float ref_y = (float) InputTools.readDouble("Referenzpunkt y: ");

			if (x == 'r') {
				float h = (float) InputTools.readDouble("Hoehe: ");
				float b = (float) InputTools.readDouble("Breite: ");
				figuren[i] = new Rechteck(ref_x, ref_y, h, b);
			} else if (x == 'k') {
				float r = (float) InputTools.readDouble("Radius: ");
				figuren[i] = new Kreis(ref_x, ref_y, r);
			} else {
				throw new IllegalArgumentException("Keine gültige Figur.");
			}
		}
		System.out.println("\nAusgabe der Figuren: ");
		for(Figur f : figuren) {
			System.out.println(f);
		}

	}

}
