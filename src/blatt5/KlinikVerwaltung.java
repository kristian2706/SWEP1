package blatt5;

import uebungsAufgaben.InputTools;

public class KlinikVerwaltung {
	public static void main(String[] args) {

		Adresse a = new Adresse();
		a.setStr("Robert-Weixler-Straße");
		a.setHausNr("50");
		a.setPlz("87439");
		a.setOrt("Kempten");

		Klinik k = new Klinik();
		k.setName("Klinikum Kempten");
		k.setAdr(a);
		k.setAnzBetten(510);
		k.setHatnotaufnahme(true);

		System.out.println(k);

		String str, hausnr, plz, ort;

		str = InputTools.readString("Strasse eingeben: ");
		hausnr = InputTools.readString("Hausnummer eingeben: ");
		plz = InputTools.readString("Postleitzahl eingeben: ");
		ort = InputTools.readString("Ort eingeben: ");

		Adresse adr2 = new Adresse(str, hausnr, plz, ort);

		String name = InputTools.readString("Name des Klinikums eingeben: ");
		int anzBet = InputTools.readInteger("Anzahl der Betten eingeben: ");
		// int notaufnahme = InputTools.readInteger("1 = hat eine Notaufnahme | 0 = hat
		// keine Notaufnahme: ");
		String notaufnahme = InputTools.readString("JA = hat eine Notaufnahme | NEIN = hat keine Notaufnahme: ");

//		if (notaufnahme == 1) {
//			hatNotaufnahme = true;
//		} else {
//			hatNotaufnahme = false;
//		}

		Klinik k2 = new Klinik(name, anzBet, notaufnahme.equalsIgnoreCase("ja"), adr2);

		System.out.println(k2);

	}

}
