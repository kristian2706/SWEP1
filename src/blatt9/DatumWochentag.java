package blatt9;

import uebungsAufgaben.InputTools;

public class DatumWochentag {
	public static void main(String[] args) {

		// Datum einlesen
		int tag = InputTools.readInteger("Gib den Tag ein (1-31): ");
		int monat = InputTools.readInteger("Gib den Monat ein (1-12): ");
		int jahr = InputTools.readInteger("Gib das Jahr ein (1900-2100): ");

		int[] tageInMonat = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] tage = { "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag" };

		// Gesamtzahl Tage bis zum Jahr
		int jahreInTage = (jahr - 1900) * 365;
		// Anzahl von Schalttagen bis zum Jahr
		int schalttage = (jahr - 1900) / 4;
		int temp = 0;

		// Addiere Tage der Monate bis zum eingegebenen Monat
		for (int i = 0; i < monat; i++) {
			temp = tageInMonat[i] + temp;
		}

		// Schalttag Korrektur
		if ((jahr - 1900) % 4 == 0 && (monat <= 2)) {
			schalttage--;
		}

		int gesamtTage = tag + jahreInTage + schalttage + temp;

		System.out.println(tage[gesamtTage % 7]);

	}

}
